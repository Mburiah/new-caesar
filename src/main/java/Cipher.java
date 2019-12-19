public class Cipher {
        public String encrypt (String msg, int key) {
            String encrypMsg = "";
            for (int i = 0; i < msg.length(); i++) {
                // casting char to int
                if ((int) msg.charAt(i) == 32) {
                    encrypMsg += (char) 32; // ignoring space, casting int to char
                } else if ((int) msg.charAt(i) + key > 122) {
                    int temp = ((int) msg.charAt(i) + key) - 122;
                    encrypMsg += (char) (96 + temp);
                } else if ((int) msg.charAt(i) + key > 90 && (int) msg.charAt(i) < 96) {
                    int temp = ((int) msg.charAt(i) + key) - 90;
                    encrypMsg += (char) (64 + temp);
                } else {
                    encrypMsg += (char) ((int) msg.charAt(i) + key);
                }
            } // for loop
            return encrypMsg;
        }

        public String decrypt(String encypText, int dcyptkey) {
            String decrypMsg = "";
            for (int i = 0; i < encypText.length(); i++) {
                // now type casting
                if ((int) encypText.charAt(i) == 32) {
                    decrypMsg += (char) 32;
                } else if (((int) encypText.charAt(i) - dcyptkey) < 97 && ((int) encypText.charAt(i) - dcyptkey) > 90) {
                    //lower case
                    int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                    decrypMsg += (char) temp;
                } else if ((encypText.charAt(i) - dcyptkey) < 65) {
                    // upper case
                    int temp = ((int) encypText.charAt(i) - dcyptkey) + 26;
                    decrypMsg += (char) temp;
                } else {
                    decrypMsg += (char) ((int) encypText.charAt(i) - dcyptkey);
                }
            } // for loop
            return decrypMsg;
        }
}
