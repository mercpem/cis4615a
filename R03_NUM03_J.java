// Rule 03. Numeric Types and Operations (NUM)

public static int getInteger(DataInputStream is) throws IOException
{
	return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
}