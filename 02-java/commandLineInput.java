class commandLineInput {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd number");
        }
    }
}

// Execution Steps :
// javac commandLineInput.java
// java commandLineInput 5