import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// import java.io.EOFException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

public class prec_5_5{
    public static void main(String[] args) throws IOException {

        DataInputStream inputStream = null;
        DataOutputStream outputStreamEven = null;
        DataOutputStream outputStreamOdd = null;

        try {
            inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("src/input.txt")));
            outputStreamEven = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/even.txt")));
            outputStreamOdd = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/odd.txt")));

            int number;
            String textinput;
            double doublenumber;

            number = inputStream.readInt();
            textinput = inputStream.readUTF();
            doublenumber = inputStream.readDouble();

            while ((number = inputStream.read()) % 2 != 0) {
                outputStreamOdd.writeInt(number);
                outputStreamOdd.writeUTF(textinput);
                outputStreamOdd.writeDouble(doublenumber);
            }

            while ((number = inputStream.read()) % 2 == 0) {
                outputStreamEven.writeInt(number);
                outputStreamEven.writeUTF(textinput);
                outputStreamEven.writeDouble(doublenumber);
            }

        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStreamEven != null) {
                outputStreamEven.close();
            }
            if (outputStreamOdd != null) {
                outputStreamOdd.close();
            }
        }
    }
}
