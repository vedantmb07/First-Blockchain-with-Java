public class blockChain {
    public static void main(String[] args) {
        Block genesisBlock = new Block("Hi I am the first block", "0");
        System.out.println("Hash for Block 1 : " + genesisBlock.hash);

        Block secondBlock = new Block("Hi I am the second block", genesisBlock.hash);
        System.out.println("Hash for Block 2 : " + secondBlock.hash);

        Block thirdBlock = new Block("Hi I am the third block", secondBlock.hash);
        System.out.println("Hash for Block 3 : " + thirdBlock.hash);
    }
}
