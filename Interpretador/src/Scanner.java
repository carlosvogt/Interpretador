import java_cup.runtime.Symbol;

@SuppressWarnings("FallThrough")
public class Scanner implements java_cup.runtime.Scanner {
  public static final int YYEOF = -1;
  private static final int ZZ_BUFFERSIZE = 16384;
  public static final int YYINITIAL = 0;
  public static final int STRING = 2;

  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1, 1
  };

  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  3,  4,  2,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     1,  0,  5,  6,  0,  7,  8,  0,  9, 10, 11, 12, 13, 14,  0, 15, 
    16, 16, 16, 16, 16, 16, 16, 16, 16, 16,  0, 17, 18, 19, 20,  0, 
     0, 21, 21, 21, 21, 22, 21, 23, 21, 21, 21, 21, 21, 21, 21, 21, 
    21, 21, 21, 24, 21, 21, 21, 21, 21, 21, 21, 25, 26, 27,  0, 28, 
     0, 29, 30, 31, 32, 33, 21, 34, 21, 35, 21, 21, 36, 37, 38, 39, 
    40, 41, 42, 43, 44, 45, 46, 21, 21, 21, 47,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  3,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0, 48, 49,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0, 49,  0,  0,  0,  0, 49,  0,  0,  0,  0,  0, 
    49, 49, 49, 50, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 
    49, 49, 49, 49, 49, 49, 49,  0, 49, 49, 49, 49, 49, 49, 49, 49, 
    49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 49, 
    49, 49, 49, 49, 49, 49, 49,  0, 49, 49, 49, 49, 49, 49, 49, 49
  };

  private static final int [] ZZ_ACTION = zzUnpackAction();
  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\1\0\1\2\1\1\2\2\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\4\1\1\20\1\21\16\1\1\2\1\22"+
    "\1\23\1\24\1\0\2\25\1\0\1\26\1\27\1\0"+
    "\2\1\1\30\16\1\1\30\2\1\1\31\1\1\1\32"+
    "\1\33\1\34\1\35\5\1\1\36\33\1\1\37\2\1"+
    "\1\7\2\1\1\40\1\41\6\1\1\42\1\43\1\1"+
    "\1\44\4\1\1\45\1\1\1\46\1\1\1\47\1\50"+
    "\1\17\1\15\1\11\11\1\1\6\2\1\1\16\10\1"+
    "\1\51\1\52\1\53\1\54\2\1\1\55\1\56\1\12"+
    "\6\1\1\57\2\1\1\60\1\1\1\61\1\1\1\62"+
    "\1\63\10\1\1\27\1\26";

  private static int [] zzUnpackAction() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();
  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\146\0\231\0\314\0\377\0\146"+
    "\0\146\0\146\0\146\0\146\0\146\0\146\0\u0132\0\146"+
    "\0\u0165\0\146\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264\0\146"+
    "\0\146\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9"+
    "\0\u03fc\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561"+
    "\0\u0594\0\146\0\u05c7\0\231\0\231\0\u05fa\0\314\0\146"+
    "\0\146\0\u0561\0\u062d\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c"+
    "\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4"+
    "\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3\0\u09f6\0\u01cb\0\u0a29"+
    "\0\146\0\146\0\146\0\146\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5"+
    "\0\u0b28\0\u01cb\0\u0b5b\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a"+
    "\0\u0c8d\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\u0df2"+
    "\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a"+
    "\0\u0fbd\0\u0ff0\0\u1023\0\u1056\0\u1089\0\u01cb\0\u10bc\0\u10ef"+
    "\0\u01cb\0\u1122\0\u1155\0\u01cb\0\u01cb\0\u1188\0\u11bb\0\u11ee"+
    "\0\u1221\0\u1254\0\u1287\0\u01cb\0\u01cb\0\u12ba\0\u01cb\0\u12ed"+
    "\0\u1320\0\u1353\0\u1386\0\u01cb\0\u13b9\0\u01cb\0\u13ec\0\u01cb"+
    "\0\u01cb\0\u141f\0\u1452\0\u01cb\0\u1485\0\u14b8\0\u14eb\0\u151e"+
    "\0\u1551\0\u1584\0\u15b7\0\u15ea\0\u161d\0\u01cb\0\u1650\0\u1683"+
    "\0\u01cb\0\u16b6\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8"+
    "\0\u181b\0\u01cb\0\u01cb\0\u01cb\0\u01cb\0\u184e\0\u1881\0\u01cb"+
    "\0\u01cb\0\u01cb\0\u18b4\0\u18e7\0\u191a\0\u194d\0\u1980\0\u19b3"+
    "\0\u01cb\0\u19e6\0\u1a19\0\u01cb\0\u1a4c\0\u01cb\0\u1a7f\0\u01cb"+
    "\0\u01cb\0\u1ab2\0\u1ae5\0\u1b18\0\u1b4b\0\u1b7e\0\u1bb1\0\u1be4"+
    "\0\u1c17\0\u01cb\0\u01cb";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  private static final int [] ZZ_TRANS = zzUnpackTrans();
  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\2\4\1\0\1\4\1\3\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\3\1\31\1\3\1\32\1\24\1\33\1\34"+
    "\1\25\1\26\1\35\1\24\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\1\45\1\46\1\47\1\24\2\3"+
    "\1\50\2\51\1\0\2\51\1\52\24\51\1\53\30\51"+
    "\63\0\2\54\3\0\1\54\1\55\54\54\7\0\1\56"+
    "\10\0\1\57\4\0\4\57\3\0\24\57\1\0\2\57"+
    "\20\0\1\7\4\0\4\7\3\0\24\7\23\0\1\17"+
    "\65\0\1\60\62\0\1\61\64\0\4\24\4\0\23\24"+
    "\2\0\1\62\25\0\4\24\4\0\16\24\1\63\4\24"+
    "\2\0\1\62\25\0\4\24\4\0\20\24\1\64\2\24"+
    "\2\0\1\62\25\0\4\24\4\0\4\24\1\65\16\24"+
    "\2\0\1\62\25\0\4\24\4\0\17\24\1\66\3\24"+
    "\2\0\1\62\25\0\4\24\4\0\6\24\1\67\14\24"+
    "\2\0\1\62\25\0\4\24\4\0\4\24\1\70\1\24"+
    "\1\71\3\24\1\72\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\5\24\1\73\15\24\2\0\1\62\25\0\4\24"+
    "\4\0\1\74\3\24\1\75\13\24\1\76\2\24\2\0"+
    "\1\62\25\0\4\24\4\0\12\24\1\77\10\24\2\0"+
    "\1\62\25\0\4\24\4\0\6\24\1\100\14\24\2\0"+
    "\1\62\25\0\4\24\4\0\15\24\1\101\5\24\2\0"+
    "\1\62\25\0\4\24\4\0\20\24\1\102\2\24\2\0"+
    "\1\62\25\0\4\24\4\0\4\24\1\103\16\24\2\0"+
    "\1\62\25\0\4\24\4\0\4\24\1\104\16\24\2\0"+
    "\1\62\25\0\4\24\4\0\4\24\1\105\10\24\1\106"+
    "\5\24\2\0\1\62\25\0\4\24\4\0\10\24\1\107"+
    "\12\24\2\0\1\62\25\0\4\24\4\0\4\24\1\110"+
    "\16\24\2\0\1\62\60\0\1\24\2\0\2\51\1\0"+
    "\2\51\1\0\24\51\1\0\30\51\5\0\1\111\40\0"+
    "\1\112\3\0\1\113\1\0\1\114\15\0\1\57\100\0"+
    "\4\24\4\0\2\24\1\115\20\24\2\0\1\62\25\0"+
    "\4\24\4\0\1\116\22\24\2\0\1\62\25\0\4\24"+
    "\4\0\11\24\1\117\11\24\2\0\1\62\25\0\4\24"+
    "\4\0\15\24\1\120\5\24\2\0\1\62\25\0\4\24"+
    "\4\0\11\24\1\121\11\24\2\0\1\62\25\0\4\24"+
    "\4\0\22\24\1\122\2\0\1\62\25\0\4\24\4\0"+
    "\21\24\1\123\1\24\2\0\1\62\25\0\4\24\4\0"+
    "\1\24\1\124\4\24\1\125\14\24\2\0\1\62\25\0"+
    "\4\24\4\0\20\24\1\126\2\24\2\0\1\62\25\0"+
    "\4\24\4\0\6\24\1\127\14\24\2\0\1\62\25\0"+
    "\4\24\4\0\11\24\1\130\11\24\2\0\1\62\25\0"+
    "\4\24\4\0\7\24\1\131\13\24\2\0\1\62\25\0"+
    "\4\24\4\0\21\24\1\132\1\24\2\0\1\62\25\0"+
    "\4\24\4\0\17\24\1\133\3\24\2\0\1\62\25\0"+
    "\4\24\4\0\6\24\1\134\14\24\2\0\1\62\25\0"+
    "\4\24\4\0\1\135\5\24\1\136\14\24\2\0\1\62"+
    "\25\0\4\24\4\0\13\24\1\137\7\24\2\0\1\62"+
    "\25\0\4\24\4\0\5\24\1\140\1\141\2\24\1\117"+
    "\5\24\1\142\3\24\2\0\1\62\25\0\4\24\4\0"+
    "\15\24\1\143\5\24\2\0\1\62\25\0\4\24\4\0"+
    "\4\24\1\144\1\24\1\145\14\24\2\0\1\62\25\0"+
    "\4\24\4\0\22\24\1\146\2\0\1\62\25\0\4\24"+
    "\4\0\15\24\1\147\5\24\2\0\1\62\25\0\4\24"+
    "\4\0\15\24\1\150\5\24\2\0\1\62\25\0\4\24"+
    "\4\0\1\151\22\24\2\0\1\62\25\0\4\24\4\0"+
    "\6\24\1\152\14\24\2\0\1\62\25\0\4\24\4\0"+
    "\2\24\1\153\20\24\2\0\1\62\25\0\4\24\4\0"+
    "\6\24\1\154\14\24\2\0\1\62\25\0\4\24\4\0"+
    "\15\24\1\155\5\24\2\0\1\62\25\0\4\24\4\0"+
    "\16\24\1\156\4\24\2\0\1\62\25\0\4\24\4\0"+
    "\1\157\22\24\2\0\1\62\25\0\4\24\4\0\12\24"+
    "\1\160\3\24\1\161\4\24\2\0\1\62\25\0\4\24"+
    "\4\0\12\24\1\162\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\17\24\1\163\3\24\2\0\1\62\25\0\4\24"+
    "\4\0\4\24\1\164\16\24\2\0\1\62\25\0\4\24"+
    "\4\0\12\24\1\165\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\10\24\1\166\12\24\2\0\1\62\25\0\4\24"+
    "\4\0\15\24\1\167\1\24\1\170\3\24\2\0\1\62"+
    "\25\0\4\24\4\0\11\24\1\171\11\24\2\0\1\62"+
    "\25\0\4\24\4\0\6\24\1\172\14\24\2\0\1\62"+
    "\25\0\4\24\4\0\20\24\1\173\2\24\2\0\1\62"+
    "\25\0\4\24\4\0\16\24\1\174\4\24\2\0\1\62"+
    "\25\0\4\24\4\0\4\24\1\175\16\24\2\0\1\62"+
    "\25\0\4\24\4\0\2\24\1\176\20\24\2\0\1\62"+
    "\25\0\4\24\4\0\16\24\1\177\4\24\2\0\1\62"+
    "\25\0\4\24\4\0\13\24\1\200\7\24\2\0\1\62"+
    "\25\0\4\24\4\0\4\24\1\201\16\24\2\0\1\62"+
    "\25\0\4\24\4\0\4\24\1\202\16\24\2\0\1\62"+
    "\25\0\4\24\4\0\3\24\1\203\17\24\2\0\1\62"+
    "\25\0\4\24\4\0\12\24\1\204\10\24\2\0\1\62"+
    "\25\0\4\24\4\0\1\24\1\205\21\24\2\0\1\62"+
    "\25\0\4\24\4\0\12\24\1\206\10\24\2\0\1\62"+
    "\25\0\4\24\4\0\3\24\1\207\17\24\2\0\1\62"+
    "\25\0\4\24\4\0\12\24\1\210\10\24\2\0\1\62"+
    "\25\0\4\24\4\0\7\24\1\211\13\24\2\0\1\62"+
    "\25\0\4\24\4\0\15\24\1\212\5\24\2\0\1\62"+
    "\25\0\4\24\4\0\15\24\1\213\1\214\4\24\2\0"+
    "\1\62\25\0\4\24\4\0\6\24\1\215\14\24\2\0"+
    "\1\62\25\0\4\24\4\0\4\24\1\216\16\24\2\0"+
    "\1\62\25\0\4\24\4\0\17\24\1\217\3\24\2\0"+
    "\1\62\25\0\4\24\4\0\15\24\1\220\5\24\2\0"+
    "\1\62\25\0\4\24\4\0\17\24\1\221\3\24\2\0"+
    "\1\62\25\0\4\24\4\0\17\24\1\222\3\24\2\0"+
    "\1\62\25\0\4\24\4\0\11\24\1\223\11\24\2\0"+
    "\1\62\25\0\4\24\4\0\4\24\1\224\16\24\2\0"+
    "\1\62\25\0\4\24\4\0\7\24\1\225\13\24\2\0"+
    "\1\62\25\0\4\24\4\0\16\24\1\226\4\24\2\0"+
    "\1\62\25\0\4\24\4\0\21\24\1\227\1\24\2\0"+
    "\1\62\25\0\4\24\4\0\1\230\3\24\1\231\16\24"+
    "\2\0\1\62\25\0\4\24\4\0\20\24\1\232\2\24"+
    "\2\0\1\62\25\0\4\24\4\0\6\24\1\233\14\24"+
    "\2\0\1\62\25\0\4\24\4\0\12\24\1\234\1\24"+
    "\1\235\6\24\2\0\1\62\25\0\4\24\4\0\12\24"+
    "\1\236\1\24\1\237\6\24\2\0\1\62\25\0\4\24"+
    "\4\0\13\24\1\240\7\24\2\0\1\62\25\0\4\24"+
    "\4\0\6\24\1\241\14\24\2\0\1\62\25\0\4\24"+
    "\4\0\12\24\1\242\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\12\24\1\243\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\12\24\1\244\10\24\2\0\1\62\25\0\4\24"+
    "\4\0\1\245\22\24\2\0\1\62\25\0\4\24\4\0"+
    "\3\24\1\246\17\24\2\0\1\62\25\0\4\24\4\0"+
    "\6\24\1\247\14\24\2\0\1\62\25\0\4\24\4\0"+
    "\12\24\1\250\10\24\2\0\1\62\25\0\4\24\4\0"+
    "\1\251\22\24\2\0\1\62\25\0\4\24\4\0\15\24"+
    "\1\231\5\24\2\0\1\62\25\0\4\24\4\0\6\24"+
    "\1\230\14\24\2\0\1\62\25\0\4\24\4\0\15\24"+
    "\1\252\5\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\253\2\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\254\2\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\255\2\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\256\2\24\2\0\1\62\25\0\4\24\4\0\7\24"+
    "\1\257\13\24\2\0\1\62\25\0\4\24\4\0\15\24"+
    "\1\260\5\24\2\0\1\62\25\0\4\24\4\0\12\24"+
    "\1\261\10\24\2\0\1\62\25\0\4\24\4\0\15\24"+
    "\1\262\5\24\2\0\1\62\25\0\4\24\4\0\6\24"+
    "\1\263\14\24\2\0\1\62\25\0\4\24\4\0\4\24"+
    "\1\264\16\24\2\0\1\62\25\0\4\24\4\0\6\24"+
    "\1\265\14\24\2\0\1\62\25\0\4\24\4\0\4\24"+
    "\1\266\16\24\2\0\1\62\25\0\4\24\4\0\6\24"+
    "\1\267\14\24\2\0\1\62\25\0\4\24\4\0\12\24"+
    "\1\270\10\24\2\0\1\62\25\0\4\24\4\0\12\24"+
    "\1\271\10\24\2\0\1\62\25\0\4\24\4\0\5\24"+
    "\1\272\15\24\2\0\1\62\25\0\4\24\4\0\5\24"+
    "\1\273\15\24\2\0\1\62\25\0\4\24\4\0\2\24"+
    "\1\274\20\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\275\2\24\2\0\1\62\25\0\4\24\4\0\20\24"+
    "\1\276\2\24\2\0\1\62\25\0\4\24\4\0\1\277"+
    "\22\24\2\0\1\62\25\0\4\24\4\0\1\300\22\24"+
    "\2\0\1\62\25\0\4\24\4\0\1\301\22\24\2\0"+
    "\1\62\25\0\4\24\4\0\15\24\1\226\5\24\2\0"+
    "\1\62\25\0\4\24\4\0\7\24\1\302\13\24\2\0"+
    "\1\62\25\0\4\24\4\0\7\24\1\303\13\24\2\0"+
    "\1\62";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7242];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();
  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\1\0\2\11\3\1\7\11\1\1\1\11\1\1"+
    "\1\11\5\1\2\11\20\1\1\11\1\1\1\0\2\1"+
    "\1\0\2\11\1\0\26\1\4\11\167\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[195];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }
  private java.io.Reader zzReader;
  private int zzState;
  private int zzLexicalState = YYINITIAL;
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];
  private int zzMarkedPos;
  private int zzCurrentPos;
  private int zzStartRead;
  private int zzEndRead;
  private boolean zzAtEOF;
  private int zzFinalHighSurrogate = 0;
  private int yyline;
  @SuppressWarnings("unused")
  private int yycolumn;
  private long yychar;
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;
  private boolean zzEOFDone;

    StringBuffer string = new StringBuffer();
	
	public void report_error(String message, Object info)  {
        System.out.println("Warning - " + message);
    }

    public void report_fatal_error(String message, Object info)  {
        System.out.println("Error - " + message);
        System.exit(-1);
    }

  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  private static int zzCMap(int input) {
    return ZZ_CMAP[input];
  }

  private boolean zzRefill() throws java.io.IOException {

    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    
          int c = zzReader.read();  
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      return false;
    }
    return true;
  }

  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; 
    zzEndRead = zzStartRead; 

    if (zzReader != null) {
      zzReader.close();
    }
  }

  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }

  public final boolean yyatEOF() {
    return zzAtEOF;
  }

  public final int yystate() {
    return zzLexicalState;
  }

  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }

  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }

  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }

  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }

  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }

  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }

  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }

  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B': 
        case '\u000C':  
        case '\u0085':  
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;
      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
      zzState = ZZ_LEXSTATE[zzLexicalState];
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }

      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { 	return new Symbol(Tokens.EOF,new String("Fim do arquivo"));
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
          case 52: break;
          case 2:
            { System.out.println("Caracter ilegal: " + yytext());
            }
          case 53: break;
          case 3:
            { return new Symbol(Tokens.ID, 			 yytext());
            }
          case 54: break;
          case 4:
            { return new Symbol(Tokens.LPAREN, 		 yytext());
            }
          case 55: break;
          case 5:
            { return new Symbol(Tokens.RPAREN, 		 yytext());
            }
          case 56: break;
          case 6:
            { return new Symbol(Tokens.VEZES, 		 yytext());
            }
          case 57: break;
          case 7:
            { return new Symbol(Tokens.MAIS, 		 yytext());
            }
          case 58: break;
          case 8:
            { return new Symbol(Tokens.VIRG, 		 yytext());
            }
          case 59: break;
          case 9:
            { return new Symbol(Tokens.MENOS, 		 yytext());
            }
          case 60: break;
          case 10:
            { return new Symbol(Tokens.DIVIDIR, 		 yytext());
            }
          case 61: break;
          case 11:
            { return new Symbol(Tokens.NUMERO, 		 new Integer(yytext()));
            }
          case 62: break;
          case 12:
            { return new Symbol(Tokens.SEMI, 		 yytext());
            }
          case 63: break;
          case 13:
            { return new Symbol(Tokens.MENOR, 		 yytext());
            }
          case 64: break;
          case 14:
            { return new Symbol(Tokens.ATRIB, 		 yytext());
            }
          case 65: break;
          case 15:
            { return new Symbol(Tokens.MAIOR, 		 yytext());
            }
          case 66: break;
          case 16:
            { return new Symbol(Tokens.LCOL, 		 yytext());
            }
          case 67: break;
          case 17:
            { return new Symbol(Tokens.RCOL, 		 yytext());
            }
          case 68: break;
          case 18:
            { string.append(yytext() );
            }
          case 69: break;
          case 19:
            { yybegin(YYINITIAL); 
      return new Symbol(Tokens.PALAVRA,string.toString());
            }
          case 70: break;
          case 20:
            { string.append('\\');
            }
          case 71: break;
          case 21:
            { return new Symbol(Tokens.PALAVRA,  yytext());
            }
          case 72: break;
          case 22:
            { return new Symbol(Tokens.MENORIGUAL, 	 yytext());
            }
          case 73: break;
          case 23:
            { return new Symbol(Tokens.MAIORIGUAL, 	 yytext());
            }
          case 74: break;
          case 24:
            { return new Symbol(Tokens.IF, 			 yytext());
            }
          case 75: break;
          case 25:
            { return new Symbol(Tokens.UM, 			 yytext());
            }
          case 76: break;
          case 26:
            { string.append('\"');
            }
          case 77: break;
          case 27:
            { string.append('\n');
            }
          case 78: break;
          case 28:
            { string.append('\r');
            }
          case 79: break;
          case 29:
            { string.append('\t');
            }
          case 80: break;
          case 30:
            { return new Symbol(Tokens.DEZ, 			 yytext());
            }
          case 81: break;
          case 31:
            { return new Symbol(Tokens.DOIS, 		 yytext());
            }
          case 82: break;
          case 32:
            { return new Symbol(Tokens.NOVE, 		 yytext());
            }
          case 83: break;
          case 33:
            { return new Symbol(Tokens.OITO, 		 yytext());
            }
          case 84: break;
          case 34:
            { return new Symbol(Tokens.SEIS, 		 yytext());
            }
          case 85: break;
          case 35:
            { return new Symbol(Tokens.SETE, 		 yytext());
            }
          case 86: break;
          case 36:
            { return new Symbol(Tokens.TRES, 		 yytext());
            }
          case 87: break;
          case 37:
            { return new Symbol(Tokens.ELSE, 		 yytext());
            }
          case 88: break;
          case 38:
            { return new Symbol(Tokens.CINCO, 		 yytext());
            }
          case 89: break;
          case 39:
            { return new Symbol(Tokens.DOBRO, 		 yytext());
            }
          case 90: break;
          case 40:
            { return new Symbol(Tokens.IGUAL, 		 yytext());
            }
          case 91: break;
          case 41:
            { return new Symbol(Tokens.QUARTO, 		 yytext());
            }
          case 92: break;
          case 42:
            { return new Symbol(Tokens.QUATRO, 		 yytext());
            }
          case 93: break;
          case 43:
            { return new Symbol(Tokens.QUINTO, 		 yytext());
            }
          case 94: break;
          case 44:
            { return new Symbol(Tokens.WHILE, 		 yytext());
            }
          case 95: break;
          case 45:
            { return new Symbol(Tokens.TRIPLO, 		 yytext());
            }
          case 96: break;
          case 46:
            { return new Symbol(Tokens.WRITE, 		 yytext());
            }
          case 97: break;
          case 47:
            { return new Symbol(Tokens.SEGUNDO, 		 yytext());
            }
          case 98: break;
          case 48:
            { return new Symbol(Tokens.MAIORQUE, 	 yytext());
            }
          case 99: break;
          case 49:
            { return new Symbol(Tokens.MENORQUE, 	 yytext());
            }
          case 100: break;
          case 50:
            { return new Symbol(Tokens.PRIMEIRO, 	 yytext());
            }
          case 101: break;
          case 51:
            { return new Symbol(Tokens.TERCEIRO, 	 yytext());
            }
          case 102: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }
}
