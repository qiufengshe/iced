// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

package com.github.icedland.iced.x86.enc;

import com.github.icedland.iced.x86.Code;
import com.github.icedland.iced.x86.ConstantOffsets;
import com.github.icedland.iced.x86.Instruction;
import com.github.icedland.iced.x86.OpKind;
import com.github.icedland.iced.x86.Register;

abstract class Instr {
	final Block block;
	int size;
	long ip;
	final long origIP;
	// If it can't be optimized, this will be set to true
	boolean done;

	// 6 = FF 15 XXXXXXXX = call qword ptr [rip+mem_target]
	static final int CALL_OR_JMP_POINTER_DATA_INSTRUCTION_SIZE64 = 6;

	Instr(Block block, long origIp) {
		this.origIP = origIp;
		this.block = block;
	}

	/**
	 * Initializes the target address and tries to optimize the instruction
	 */
	abstract void initialize(BlockEncoder blockEncoder);

	/**
	 * Returns {@code true} if the instruction was updated to a shorter instruction, {@code false} if nothing changed
	 */
	abstract boolean optimize(long gained);

	abstract String tryEncode(Encoder encoder, TryEncodeResult result);

	protected static String createErrorMessage(String errorMessage, Instruction instruction) {
		return String.format("%s : 0x%X %s", errorMessage, instruction.getIP(), instruction.toString());
	}

	static Instr create(BlockEncoder blockEncoder, Block block, Instruction instruction) {
		switch (instruction.getCode()) {
		// GENERATOR-BEGIN: JccInstr
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		case Code.JO_REL8_16:
		case Code.JO_REL8_32:
		case Code.JO_REL8_64:
		case Code.JNO_REL8_16:
		case Code.JNO_REL8_32:
		case Code.JNO_REL8_64:
		case Code.JB_REL8_16:
		case Code.JB_REL8_32:
		case Code.JB_REL8_64:
		case Code.JAE_REL8_16:
		case Code.JAE_REL8_32:
		case Code.JAE_REL8_64:
		case Code.JE_REL8_16:
		case Code.JE_REL8_32:
		case Code.JE_REL8_64:
		case Code.JNE_REL8_16:
		case Code.JNE_REL8_32:
		case Code.JNE_REL8_64:
		case Code.JBE_REL8_16:
		case Code.JBE_REL8_32:
		case Code.JBE_REL8_64:
		case Code.JA_REL8_16:
		case Code.JA_REL8_32:
		case Code.JA_REL8_64:
		case Code.JS_REL8_16:
		case Code.JS_REL8_32:
		case Code.JS_REL8_64:
		case Code.JNS_REL8_16:
		case Code.JNS_REL8_32:
		case Code.JNS_REL8_64:
		case Code.JP_REL8_16:
		case Code.JP_REL8_32:
		case Code.JP_REL8_64:
		case Code.JNP_REL8_16:
		case Code.JNP_REL8_32:
		case Code.JNP_REL8_64:
		case Code.JL_REL8_16:
		case Code.JL_REL8_32:
		case Code.JL_REL8_64:
		case Code.JGE_REL8_16:
		case Code.JGE_REL8_32:
		case Code.JGE_REL8_64:
		case Code.JLE_REL8_16:
		case Code.JLE_REL8_32:
		case Code.JLE_REL8_64:
		case Code.JG_REL8_16:
		case Code.JG_REL8_32:
		case Code.JG_REL8_64:
		case Code.JO_REL16:
		case Code.JO_REL32_32:
		case Code.JO_REL32_64:
		case Code.JNO_REL16:
		case Code.JNO_REL32_32:
		case Code.JNO_REL32_64:
		case Code.JB_REL16:
		case Code.JB_REL32_32:
		case Code.JB_REL32_64:
		case Code.JAE_REL16:
		case Code.JAE_REL32_32:
		case Code.JAE_REL32_64:
		case Code.JE_REL16:
		case Code.JE_REL32_32:
		case Code.JE_REL32_64:
		case Code.JNE_REL16:
		case Code.JNE_REL32_32:
		case Code.JNE_REL32_64:
		case Code.JBE_REL16:
		case Code.JBE_REL32_32:
		case Code.JBE_REL32_64:
		case Code.JA_REL16:
		case Code.JA_REL32_32:
		case Code.JA_REL32_64:
		case Code.JS_REL16:
		case Code.JS_REL32_32:
		case Code.JS_REL32_64:
		case Code.JNS_REL16:
		case Code.JNS_REL32_32:
		case Code.JNS_REL32_64:
		case Code.JP_REL16:
		case Code.JP_REL32_32:
		case Code.JP_REL32_64:
		case Code.JNP_REL16:
		case Code.JNP_REL32_32:
		case Code.JNP_REL32_64:
		case Code.JL_REL16:
		case Code.JL_REL32_32:
		case Code.JL_REL32_64:
		case Code.JGE_REL16:
		case Code.JGE_REL32_32:
		case Code.JGE_REL32_64:
		case Code.JLE_REL16:
		case Code.JLE_REL32_32:
		case Code.JLE_REL32_64:
		case Code.JG_REL16:
		case Code.JG_REL32_32:
		case Code.JG_REL32_64:
		case Code.VEX_KNC_JKZD_KR_REL8_64:
		case Code.VEX_KNC_JKNZD_KR_REL8_64:
		case Code.VEX_KNC_JKZD_KR_REL32_64:
		case Code.VEX_KNC_JKNZD_KR_REL32_64:
			return new JccInstr(blockEncoder, block, instruction);
		// GENERATOR-END: JccInstr

		// GENERATOR-BEGIN: SimpleBranchInstr
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		case Code.LOOPNE_REL8_16_CX:
		case Code.LOOPNE_REL8_32_CX:
		case Code.LOOPNE_REL8_16_ECX:
		case Code.LOOPNE_REL8_32_ECX:
		case Code.LOOPNE_REL8_64_ECX:
		case Code.LOOPNE_REL8_16_RCX:
		case Code.LOOPNE_REL8_64_RCX:
		case Code.LOOPE_REL8_16_CX:
		case Code.LOOPE_REL8_32_CX:
		case Code.LOOPE_REL8_16_ECX:
		case Code.LOOPE_REL8_32_ECX:
		case Code.LOOPE_REL8_64_ECX:
		case Code.LOOPE_REL8_16_RCX:
		case Code.LOOPE_REL8_64_RCX:
		case Code.LOOP_REL8_16_CX:
		case Code.LOOP_REL8_32_CX:
		case Code.LOOP_REL8_16_ECX:
		case Code.LOOP_REL8_32_ECX:
		case Code.LOOP_REL8_64_ECX:
		case Code.LOOP_REL8_16_RCX:
		case Code.LOOP_REL8_64_RCX:
		case Code.JCXZ_REL8_16:
		case Code.JCXZ_REL8_32:
		case Code.JECXZ_REL8_16:
		case Code.JECXZ_REL8_32:
		case Code.JECXZ_REL8_64:
		case Code.JRCXZ_REL8_16:
		case Code.JRCXZ_REL8_64:
			return new SimpleBranchInstr(blockEncoder, block, instruction);
		// GENERATOR-END: SimpleBranchInstr

		// GENERATOR-BEGIN: CallInstr
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		case Code.CALL_REL16:
		case Code.CALL_REL32_32:
		case Code.CALL_REL32_64:
			return new CallInstr(blockEncoder, block, instruction);
		// GENERATOR-END: CallInstr

		// GENERATOR-BEGIN: JmpInstr
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		case Code.JMP_REL16:
		case Code.JMP_REL32_32:
		case Code.JMP_REL32_64:
		case Code.JMP_REL8_16:
		case Code.JMP_REL8_32:
		case Code.JMP_REL8_64:
			return new JmpInstr(blockEncoder, block, instruction);
		// GENERATOR-END: JmpInstr

		// GENERATOR-BEGIN: XbeginInstr
		// ⚠️This was generated by GENERATOR!🦹‍♂️
		case Code.XBEGIN_REL16:
		case Code.XBEGIN_REL32:
			return new XbeginInstr(blockEncoder, block, instruction);
		// GENERATOR-END: XbeginInstr
		default:
			break;
		}

		if (blockEncoder.getBitness() == 64) {
			int ops = instruction.getOpCount();
			for (int i = 0; i < ops; i++) {
				if (instruction.getOpKind(i) == OpKind.MEMORY) {
					if (instruction.isIPRelativeMemoryOperand())
						return new IpRelMemOpInstr(blockEncoder, block, instruction);
					break;
				}
			}
		}

		return new SimpleInstr(blockEncoder, block, instruction);
	}

	Object encodeBranchToPointerData(Encoder encoder, boolean isCall, long ip, BlockData pointerData, int minSize) {
		if (minSize < 0)
			throw new IllegalArgumentException("minSize");

		Instruction instr = new Instruction();
		instr.setOp0Kind(OpKind.MEMORY);
		instr.setMemoryDisplSize(encoder.getBitness() / 8);
		int relocKind;
		switch (encoder.getBitness()) {
		case 64:
			instr.setCode(isCall ? Code.CALL_RM64 : Code.JMP_RM64);
			instr.setMemoryBase(Register.RIP);

			long nextRip = ip + CALL_OR_JMP_POINTER_DATA_INSTRUCTION_SIZE64;
			long diff = pointerData.getAddress() - nextRip;
			if (!(-0x8000_0000 <= diff && diff <= 0x7FFF_FFFF))
				return "Block is too big";

			instr.setMemoryDisplacement64(pointerData.getAddress());
			relocKind = RelocKind.OFFSET64;
			break;

		default:
			throw new UnsupportedOperationException();
		}

		Object result = encoder.tryEncode(instr, ip);
		if (result instanceof String)
			return (String)result;
		int size = ((Integer)result).intValue();
		if (block.canAddRelocInfos() && relocKind != RelocKind.OFFSET64) {
			ConstantOffsets constantOffsets = encoder.getConstantOffsets();
			if (!constantOffsets.hasDisplacement())
				return "Internal error: no displ";
			block.addRelocInfo(new RelocInfo(relocKind, ip + constantOffsets.displacementOffset));
		}
		while (size < minSize) {
			size++;
			block.codeWriter.writeByte((byte)0x90);
		}
		return null;
	}

	protected static long correctDiff(boolean inBlock, long diff, long gained) {
		if (inBlock && diff >= 0) {
			assert Long.compareUnsigned(diff, gained) >= 0;
			return diff - gained;
		}
		else
			return diff;
	}

	protected static long convertDiffToBitnessDiff(int bitness, long diff) {
		switch (bitness) {
		case 16:
			return (short)diff;
		case 32:
			return (int)diff;
		default: 
			return diff;
		}
	}
}
