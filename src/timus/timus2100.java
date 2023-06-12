package timus;

import java.io.*;

public class timus2100 {
    public static void main(String[] args) {

        int marshaAndLilly = 2;

        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String readLine = "";

            int numberOfFriends = 0;
            int numberOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if (numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    numberOfPairs++;
                }
            }
            int result;
            int guests = (marshaAndLilly + numberOfFriends + numberOfPairs);

            if (guests == 13){
                result = (guests * 100) + 100;
            } else {
                result = guests * 100;
            }

            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
