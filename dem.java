package com.dem;

	/*class A
    {
        public String toString()
        {
            return "hai";
    }*/

 class sample {
     public static void main(String arg[]) {
        /*String s ="This is a demo of the getchars method";
        char buf[] = new char[100];
        s.getChars(10,14,buf,0);
        System.out.println(buf);
    }
}
       /* A a = new A();
        String s = "welcome" + a;
        System.out.println(s);
    }
}*/
         String str[] = {"Now", "is", "the", "time", "for", "all", "good", "men"};
         for (int i = 0; i < str.length; i++) {
             for (int j = i + 1; j < str.length; j++) {
                 if (str[i].compareTo(str[j]) > 0) {
                     String t = str[j];
                     str[j] = str[i];
                     str[i] = t;
                 }
             }
             System.out.println(str[i]);
         }
     }
 }




