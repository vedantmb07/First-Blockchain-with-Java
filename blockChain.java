
import java.util.ArrayList;
import com.google.gson.GsonBuilder;

public class blockChain {

    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 5;

    public static void main(String[] args) {

        blockchain.add(new Block("Hi I am first block", "0"));
        System.out.println("Trying to mine block 1... ");
        blockchain.get(0).mineBlock(difficulty);

        blockchain.add(new Block("Yo I am second block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to mine block 2...");
        blockchain.get(1).mineBlock(difficulty);

        blockchain.add(new Block("Hey I am third block", blockchain.get(blockchain.size() - 1).hash));
        System.out.println("Trying to mine block 3...");
        blockchain.get(2).mineBlock(difficulty);

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);
        System.out.println("\nThe block chain: ");
        System.out.println(blockchainJson);
    }

    public static Boolean isChainValid() {
        Block currentBlock;
        Block previousBlock;
        String hashTarget = new String(new char[difficulty]).replace('\0', '0');

        for (int i = 0; i < blockchain.size(); i++) {
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            if (!currentBlock.hash.equals(currentBlock.calculateHash())) {
                System.out.println("Current Hashes not equal.");
                return false;
            }

            if (!previousBlock.hash.equals(previousBlock.calculateHash())) {
                System.out.println("Previous Hashes not equal.");
                return false;
            }

            if (!currentBlock.hash.substring(0, difficulty).equals(hashTarget)) {
                System.out.println("The block hasn't been mined");
                return false;
            }
        }

        return true;
    }
}
