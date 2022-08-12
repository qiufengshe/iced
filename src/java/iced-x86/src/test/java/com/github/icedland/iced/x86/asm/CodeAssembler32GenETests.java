// SPDX-License-Identifier: MIT
// Copyright (C) 2018-present iced project and contributors

// ⚠️This file was generated by GENERATOR!🦹‍♂️

package com.github.icedland.iced.x86.asm;

import org.junit.jupiter.api.Test;

import com.github.icedland.iced.x86.*;
import static com.github.icedland.iced.x86.asm.AsmRegisters.*;

final class CodeAssembler32GenETests extends CodeAssemblerTestsBase {
	CodeAssembler32GenETests() {
		super(32);
	}

	@Test
	void emms() {
		testAssembler(c -> c.emms(), Instruction.create(Code.EMMS));
	}

	@Test
	void encls() {
		testAssembler(c -> c.encls(), Instruction.create(Code.ENCLS));
	}

	@Test
	void enclu() {
		testAssembler(c -> c.enclu(), Instruction.create(Code.ENCLU));
	}

	@Test
	void enclv() {
		testAssembler(c -> c.enclv(), Instruction.create(Code.ENCLV));
	}

	@Test
	void encodekey128_r32_r32() {
		testAssembler(c -> c.encodekey128(edx, ebx), Instruction.create(Code.ENCODEKEY128_R32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void encodekey256_r32_r32() {
		testAssembler(c -> c.encodekey256(edx, ebx), Instruction.create(Code.ENCODEKEY256_R32_R32, ICRegisters.edx, ICRegisters.ebx));
	}

	@Test
	void endbr32() {
		testAssembler(c -> c.endbr32(), Instruction.create(Code.ENDBR32));
	}

	@Test
	void endbr64() {
		testAssembler(c -> c.endbr64(), Instruction.create(Code.ENDBR64));
	}

	@Test
	void enqcmd_r16_m() {
		testAssembler(c -> c.enqcmd(dx, mem_ptr(0x0L).base(si)), Instruction.create(Code.ENQCMD_R16_M512, ICRegisters.dx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void enqcmd_r32_m() {
		testAssembler(c -> c.enqcmd(edx, mem_ptr(0x0L).base(ecx)), Instruction.create(Code.ENQCMD_R32_M512, ICRegisters.edx, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void enqcmds_r16_m() {
		testAssembler(c -> c.enqcmds(dx, mem_ptr(0x0L).base(si)), Instruction.create(Code.ENQCMDS_R16_M512, ICRegisters.dx, new MemoryOperand(ICRegisters.si, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void enqcmds_r32_m() {
		testAssembler(c -> c.enqcmds(edx, mem_ptr(0x0L).base(ecx)), Instruction.create(Code.ENQCMDS_R32_M512, ICRegisters.edx, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)));
	}

	@Test
	void enter_i_i() {
		{ // skip (getBitness() == 64) not supported by this CodeAssembler bitness
		} /* else */ { /* if (getBitness() >= 32) */
			testAssembler(c -> c.enter(0x40B7, -5), Instruction.create(Code.ENTERD_IMM16_IMM8, 0x40B7, -5));
		} /* else skip !(getBitness() >= 32) not supported by this CodeAssembler bitness */
	}

	@Test
	void extractps_r32_xmm_i() {
		testAssembler(c -> c.extractps(edx, xmm3, -5), Instruction.create(Code.EXTRACTPS_RM32_XMM_IMM8, ICRegisters.edx, ICRegisters.xmm3, -5));
	}

	@Test
	void extractps_m_xmm_i() {
		testAssembler(c -> c.extractps(dword_ptr(0x0L).base(ecx), xmm3, -5), Instruction.create(Code.EXTRACTPS_RM32_XMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.xmm3, -5));
	}

	@Test
	void extrq_xmm_xmm() {
		testAssembler(c -> c.extrq(xmm2, xmm3), Instruction.create(Code.EXTRQ_XMM_XMM, ICRegisters.xmm2, ICRegisters.xmm3));
	}

	@Test
	void extrq_xmm_i_i() {
		testAssembler(c -> c.extrq(xmm2, -5, -5), Instruction.create(Code.EXTRQ_XMM_IMM8_IMM8, ICRegisters.xmm2, -5, -5));
	}

	@Test
	void vexp2pd_zmm_zmm() {
		testAssembler(c -> c.vexp2pd(zmm2.k1(), zmm3), applyK(Instruction.create(Code.EVEX_VEXP2PD_ZMM_K1Z_ZMMM512B64_SAE, ICRegisters.zmm2, ICRegisters.zmm3), Register.K1));
	}

	@Test
	void vexp2pd_zmm_m() {
		testAssembler(c -> c.vexp2pd(zmm2.k1(), zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXP2PD_ZMM_K1Z_ZMMM512B64_SAE, ICRegisters.zmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexp2ps_zmm_zmm() {
		testAssembler(c -> c.vexp2ps(zmm2.k1(), zmm3), applyK(Instruction.create(Code.EVEX_VEXP2PS_ZMM_K1Z_ZMMM512B32_SAE, ICRegisters.zmm2, ICRegisters.zmm3), Register.K1));
	}

	@Test
	void vexp2ps_zmm_m() {
		testAssembler(c -> c.vexp2ps(zmm2.k1(), zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXP2PS_ZMM_K1Z_ZMMM512B32_SAE, ICRegisters.zmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandpd_xmm_xmm() {
		testAssembler(c -> c.vexpandpd(xmm2.k1(), xmm3), applyK(Instruction.create(Code.EVEX_VEXPANDPD_XMM_K1Z_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3), Register.K1));
	}

	@Test
	void vexpandpd_ymm_ymm() {
		testAssembler(c -> c.vexpandpd(ymm2.k1(), ymm3), applyK(Instruction.create(Code.EVEX_VEXPANDPD_YMM_K1Z_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3), Register.K1));
	}

	@Test
	void vexpandpd_zmm_zmm() {
		testAssembler(c -> c.vexpandpd(zmm2.k1(), zmm3), applyK(Instruction.create(Code.EVEX_VEXPANDPD_ZMM_K1Z_ZMMM512, ICRegisters.zmm2, ICRegisters.zmm3), Register.K1));
	}

	@Test
	void vexpandpd_xmm_m() {
		testAssembler(c -> c.vexpandpd(xmm2.k1(), xmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPD_XMM_K1Z_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandpd_ymm_m() {
		testAssembler(c -> c.vexpandpd(ymm2.k1(), ymmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPD_YMM_K1Z_YMMM256, ICRegisters.ymm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandpd_zmm_m() {
		testAssembler(c -> c.vexpandpd(zmm2.k1(), zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPD_ZMM_K1Z_ZMMM512, ICRegisters.zmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandps_xmm_xmm() {
		testAssembler(c -> c.vexpandps(xmm2.k1(), xmm3), applyK(Instruction.create(Code.EVEX_VEXPANDPS_XMM_K1Z_XMMM128, ICRegisters.xmm2, ICRegisters.xmm3), Register.K1));
	}

	@Test
	void vexpandps_ymm_ymm() {
		testAssembler(c -> c.vexpandps(ymm2.k1(), ymm3), applyK(Instruction.create(Code.EVEX_VEXPANDPS_YMM_K1Z_YMMM256, ICRegisters.ymm2, ICRegisters.ymm3), Register.K1));
	}

	@Test
	void vexpandps_zmm_zmm() {
		testAssembler(c -> c.vexpandps(zmm2.k1(), zmm3), applyK(Instruction.create(Code.EVEX_VEXPANDPS_ZMM_K1Z_ZMMM512, ICRegisters.zmm2, ICRegisters.zmm3), Register.K1));
	}

	@Test
	void vexpandps_xmm_m() {
		testAssembler(c -> c.vexpandps(xmm2.k1(), xmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPS_XMM_K1Z_XMMM128, ICRegisters.xmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandps_ymm_m() {
		testAssembler(c -> c.vexpandps(ymm2.k1(), ymmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPS_YMM_K1Z_YMMM256, ICRegisters.ymm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vexpandps_zmm_m() {
		testAssembler(c -> c.vexpandps(zmm2.k1(), zmmword_ptr(0x0L).base(ecx)), applyK(Instruction.create(Code.EVEX_VEXPANDPS_ZMM_K1Z_ZMMM512, ICRegisters.zmm2, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE)), Register.K1));
	}

	@Test
	void vextractf128_xmm_ymm_i() {
		testAssembler(c -> c.vextractf128(xmm2, ymm3, -5), Instruction.create(Code.VEX_VEXTRACTF128_XMMM128_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5));
	}

	@Test
	void vextractf128_m_ymm_i() {
		testAssembler(c -> c.vextractf128(xmmword_ptr(0x0L).base(ecx), ymm3, -5), Instruction.create(Code.VEX_VEXTRACTF128_XMMM128_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5));
	}

	@Test
	void vextractf32x4_xmm_ymm_i() {
		testAssembler(c -> c.vextractf32x4(xmm2.k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X4_XMMM128_K1Z_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextractf32x4_m_ymm_i() {
		testAssembler(c -> c.vextractf32x4(xmmword_ptr(0x0L).base(ecx).k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X4_XMMM128_K1Z_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextractf32x4_xmm_zmm_i() {
		testAssembler(c -> c.vextractf32x4(xmm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X4_XMMM128_K1Z_ZMM_IMM8, ICRegisters.xmm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf32x4_m_zmm_i() {
		testAssembler(c -> c.vextractf32x4(xmmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X4_XMMM128_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf32x8_ymm_zmm_i() {
		testAssembler(c -> c.vextractf32x8(ymm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X8_YMMM256_K1Z_ZMM_IMM8, ICRegisters.ymm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf32x8_m_zmm_i() {
		testAssembler(c -> c.vextractf32x8(ymmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF32X8_YMMM256_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf64x2_xmm_ymm_i() {
		testAssembler(c -> c.vextractf64x2(xmm2.k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X2_XMMM128_K1Z_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextractf64x2_m_ymm_i() {
		testAssembler(c -> c.vextractf64x2(xmmword_ptr(0x0L).base(ecx).k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X2_XMMM128_K1Z_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextractf64x2_xmm_zmm_i() {
		testAssembler(c -> c.vextractf64x2(xmm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X2_XMMM128_K1Z_ZMM_IMM8, ICRegisters.xmm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf64x2_m_zmm_i() {
		testAssembler(c -> c.vextractf64x2(xmmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X2_XMMM128_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf64x4_ymm_zmm_i() {
		testAssembler(c -> c.vextractf64x4(ymm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X4_YMMM256_K1Z_ZMM_IMM8, ICRegisters.ymm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractf64x4_m_zmm_i() {
		testAssembler(c -> c.vextractf64x4(ymmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTF64X4_YMMM256_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti128_xmm_ymm_i() {
		testAssembler(c -> c.vextracti128(xmm2, ymm3, -5), Instruction.create(Code.VEX_VEXTRACTI128_XMMM128_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5));
	}

	@Test
	void vextracti128_m_ymm_i() {
		testAssembler(c -> c.vextracti128(xmmword_ptr(0x0L).base(ecx), ymm3, -5), Instruction.create(Code.VEX_VEXTRACTI128_XMMM128_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5));
	}

	@Test
	void vextracti32x4_xmm_ymm_i() {
		testAssembler(c -> c.vextracti32x4(xmm2.k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X4_XMMM128_K1Z_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextracti32x4_m_ymm_i() {
		testAssembler(c -> c.vextracti32x4(xmmword_ptr(0x0L).base(ecx).k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X4_XMMM128_K1Z_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextracti32x4_xmm_zmm_i() {
		testAssembler(c -> c.vextracti32x4(xmm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X4_XMMM128_K1Z_ZMM_IMM8, ICRegisters.xmm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti32x4_m_zmm_i() {
		testAssembler(c -> c.vextracti32x4(xmmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X4_XMMM128_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti32x8_ymm_zmm_i() {
		testAssembler(c -> c.vextracti32x8(ymm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X8_YMMM256_K1Z_ZMM_IMM8, ICRegisters.ymm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti32x8_m_zmm_i() {
		testAssembler(c -> c.vextracti32x8(ymmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI32X8_YMMM256_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti64x2_xmm_ymm_i() {
		testAssembler(c -> c.vextracti64x2(xmm2.k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X2_XMMM128_K1Z_YMM_IMM8, ICRegisters.xmm2, ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextracti64x2_m_ymm_i() {
		testAssembler(c -> c.vextracti64x2(xmmword_ptr(0x0L).base(ecx).k1(), ymm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X2_XMMM128_K1Z_YMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.ymm3, -5), Register.K1));
	}

	@Test
	void vextracti64x2_xmm_zmm_i() {
		testAssembler(c -> c.vextracti64x2(xmm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X2_XMMM128_K1Z_ZMM_IMM8, ICRegisters.xmm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti64x2_m_zmm_i() {
		testAssembler(c -> c.vextracti64x2(xmmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X2_XMMM128_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti64x4_ymm_zmm_i() {
		testAssembler(c -> c.vextracti64x4(ymm2.k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X4_YMMM256_K1Z_ZMM_IMM8, ICRegisters.ymm2, ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextracti64x4_m_zmm_i() {
		testAssembler(c -> c.vextracti64x4(ymmword_ptr(0x0L).base(ecx).k1(), zmm3, -5), applyK(Instruction.create(Code.EVEX_VEXTRACTI64X4_YMMM256_K1Z_ZMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.zmm3, -5), Register.K1));
	}

	@Test
	void vextractps_r32_xmm_i() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vextractps(edx, xmm3, -5), Instruction.create(Code.VEX_VEXTRACTPS_RM32_XMM_IMM8, ICRegisters.edx, ICRegisters.xmm3, -5), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vextractps(edx, xmm3, -5), Instruction.create(Code.EVEX_VEXTRACTPS_RM32_XMM_IMM8, ICRegisters.edx, ICRegisters.xmm3, -5), TestInstrFlags.PREFER_EVEX);
	}

	@Test
	void vextractps_m_xmm_i() {
		{ /* if (getInstructionPreferVex()) */
			testAssembler(c -> c.vextractps(dword_ptr(0x0L).base(ecx), xmm3, -5), Instruction.create(Code.VEX_VEXTRACTPS_RM32_XMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.xmm3, -5), TestInstrFlags.PREFER_VEX);
		} /* else */ testAssembler(c -> c.vextractps(dword_ptr(0x0L).base(ecx), xmm3, -5), Instruction.create(Code.EVEX_VEXTRACTPS_RM32_XMM_IMM8, new MemoryOperand(ICRegisters.ecx, ICRegister.NONE, 1, 0x0L, 0, false, ICRegister.NONE), ICRegisters.xmm3, -5), TestInstrFlags.PREFER_EVEX);
	}

}