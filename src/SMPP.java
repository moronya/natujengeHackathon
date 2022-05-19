public class SMPP {
    public static void main(String[] args) {
        byte bytes[] = {
                0x00, 0x19, 0x00, 0x06,
                0x48, 0x65, 0x6C, 0x6C,
                0x6F};
//tag index 0 and 1 16 bits
        int tag = 0;
        tag |= (bytes[0] &0xff) << 8;
        tag |= (bytes[1] &0xff);

        //convert tag to bytes
        tag = tag *4;
        System.out.println("tag in bytes -->" + tag);



// Length index 2 and 3 -- 16 bits
        int length = 0;
        length |= (bytes[2] & 0xff) << 8;
        length |= (bytes[3] & 0xff);

        //convert length to bytes
        length = length *4;
        System.out.println("length in octets -->" + length);

        // Length index 2 and 3 -- 16 bits
        int lengthBytes = 0;
        lengthBytes |= (bytes[2] & 0xff) << 8;
        lengthBytes |= (bytes[3] & 0xff);

        //convert length to bytes
        lengthBytes = lengthBytes *4;
        System.out.println("length in bytes -->" + lengthBytes);


        // Value index 4, 5, 6, 7 -- 32 bits
        byte valueBytes [] = {
                bytes[4],bytes[5],bytes[6],bytes[7],bytes[8]
        };

        System.out.println("valueBytes in array -->" + valueBytes);

        byte result [] ={
        };
//        result = result.push(tag, lengthBytes,valueBytes );
        System.out.println("Result --> "+ result);










    }
}
