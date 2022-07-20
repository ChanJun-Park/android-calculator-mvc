package edu.nextstep.camp.domain

import com.google.common.truth.Truth
import org.junit.Test

@Suppress("NonAsciiCharacters")
class AdditionTest {

	@Test
	fun `현재 값이 3 인 경우 3을 더하면 6을 반환해야한다`() {
		// when
		val result = Addition.processOperation(3.toDouble(), NumberOperandToken("3"))

		// then
		Truth.assertThat(result).isEqualTo(6)
	}

}