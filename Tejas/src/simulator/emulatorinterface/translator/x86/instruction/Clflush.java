
package emulatorinterface.translator.x86.instruction;

import emulatorinterface.translator.InvalidInstructionException;
import emulatorinterface.translator.x86.registers.TempRegisterNum;
import generic.Operand;
import generic.Instruction;
import generic.InstructionList;

public class Clflush implements X86StaticInstructionHandler
{
	public void handle(long instructionPointer, 
			Operand operand1, Operand operand2, Operand operand3,
			InstructionList instructionArrayList,
			TempRegisterNum tempRegisterNum) 
					throws InvalidInstructionException
	{
		// operand1 is the memory address
		if (operand1.isMemoryOperand()) {
			instructionArrayList.appendInstruction(Instruction.getClflushInstruction(operand1));
		} else {
			misc.Error.invalidOperation("clflush invalid operand", operand1, operand2, operand3);
		}
	}
}
