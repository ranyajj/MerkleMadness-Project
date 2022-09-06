public class MerkleManager {

    public static volatile String enterWord;
    public static String expectedMerkleRoot;
    public static  String merkleRoot = null;
    public static int strikes = 0;

    public void manage(){

        Util util1 = new Util();
        util1.promptUser("Expected merkle root:"){

        }

        MerkleThread merkle1 = new MerkleTread;
        merkle1.threadName = "Merkle Thread";
        Thread merkThread = new Thread(merkle1);
        merkThread.start();

        RogueThread rogue1 = new RogueThread;
        rogue1.threadName = "Rogue Thread";
        Thread rThread = new Thread(rogue1);
        rThread.start();

        MonitorThread monitor1 = new MonitorThread;
        monitor1.threadName = "Monitor Thread";
        Thread monThread = new Thread(monitor1);
        monThread.start();



        while(true){
            Util util2 = new Util();
            util2.promptUser("Enter a word:"){

            }
        }
    }

    //
    public static synchronized String grabWord(){
        String tempWord = enterWord;
        enterWord = null;
        return tempWord;
    }

}
