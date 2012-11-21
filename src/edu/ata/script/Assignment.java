package edu.ata.script;

public class Assignment extends Instruction {

    public static boolean isAssignment(String instruction) {
        return StringUtils.contains(instruction, "=");
    }
    private final String name;
    private final Data value;

    public Assignment(String instruction) {
        super(instruction);
        this.name = instruction.substring(0, instruction.indexOf("=")).trim();
        this.value = Data.getData(instruction.substring(
                instruction.indexOf("=") + 1).trim());
    }

    public void run() {
        VariableQueue.put(name, value);
    }
}