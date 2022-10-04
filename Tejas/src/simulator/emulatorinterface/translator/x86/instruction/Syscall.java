
package emulatorinterface.translator.x86.instruction;

import emulatorinterface.translator.InvalidInstructionException;
import emulatorinterface.translator.x86.registers.TempRegisterNum;
import generic.Operand;
import generic.Instruction;
import generic.InstructionList;

public class Syscall implements X86StaticInstructionHandler
{
	public void handle(long instructionPointer, 
			Operand operand1, Operand operand2, Operand operand3,
			InstructionList instructionArrayList,
			TempRegisterNum tempRegisterNum) 
					throws InvalidInstructionException
	{
		instructionArrayList.appendInstruction(Instruction.getSyscallInstruction());
	}
}
