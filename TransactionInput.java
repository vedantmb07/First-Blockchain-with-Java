public class TransactionInput {
    public String transactionOuputId;
    public TransactionOutput UTXO;

    public TransactionInput(String transactionOutputId){
        this.transactionOuputId = transactionOutputId;
    }
}
