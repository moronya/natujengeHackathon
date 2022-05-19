public class NatujengeHackathon{
    public static void main(String[] args) {

        byte bytes[] = {
                0x13, 0x55, (byte)0xb6, 0x76,
                0x79, (byte)0x88, 0x29, 0x5e,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x03, 0x00, 0x34,
                0x7e, 0x58, 0x1e, 0x36,
                0x00, 0x00, 0x00, 0x00,
                0x00, 0x00, 0x00, 0x00

        };

        //index 0 and 1 - 16 bits
        int sourcePort = 0;
        sourcePort |= (bytes[0] &0xff) <<8;
        sourcePort |= (bytes[1] &0xff);
        System.out.println("sourcePort --> "+sourcePort );

        //index 2 and 3 - 16 bits
        int destinationPort = 0;
        destinationPort |= (bytes[2] &0xff) <<8;
        destinationPort |= (bytes[3] &0xff);
        System.out.println("destinationPort --> "+destinationPort );

        //index 4, 5, 6 and 7 - 32bits
        int verificationTag = 0;
        verificationTag |= (bytes[4] &0xff) <<24;
        verificationTag |= (bytes[5] &0xff) <<16;
        verificationTag |= (bytes[6] &0xff)<<8;
        verificationTag |= (bytes[7] &0xff);
        System.out.println("verificationTag --> "+verificationTag );

        //type
        //index 8 -8bit
        int type = 0;
        type |= (bytes[8]&0xff);
        System.out.println("type -->" + type);

        // B flag
        //index 9 - 1 bit
        boolean BFlag = ((bytes[9] &0xff) & 0b00000010) >0;
        System.out.println("BFlag --> "+BFlag );

        // length
        //index 10 and 11 - 16 bits
        int length = 0;
        length |= (bytes[10] &0xff) <<8;
        length |= (bytes[11] &0xff);
        System.out.println("length --> "+length );








    }
}
