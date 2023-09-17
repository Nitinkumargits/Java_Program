public class studentChallenge {
    public static void main(String[] args) {

        String str = "programmer@gmail.com";

        int i = str.indexOf("@");
        // System.out.println(i);//10

        String userName = str.substring(0, i);
        // System.out.println(userName);//programmer
        String domainName = str.substring(i + 1, str.length());
        // System.out.println(domainName);//gamil.com

        System.out.println(userName);
        System.out.println(domainName);

        /* check wether is the domain name is gmail or not */

        System.out.println(domainName.startsWith("gmail"));

        int j = domainName.indexOf(".");
        // System.out.println(j);

        String name = domainName.substring(0, j);
        System.out.println(name.equals("gmail"));
    }
}
