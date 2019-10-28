package au.csiro.data61.aap.spec;

/**
 * Instruction
 */
public abstract class Instruction {
    private final CodeBlock enclosingBlock;

    protected Instruction(CodeBlock enclosingBlock) {
        this.enclosingBlock = enclosingBlock;
    }

    public CodeBlock getEnclosingBlock() {
        return this.enclosingBlock;
    }
    
    // TODO: instructions need a way to report error handling or abort execution    
}