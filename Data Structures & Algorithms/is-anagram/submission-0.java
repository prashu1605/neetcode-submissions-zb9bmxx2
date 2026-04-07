class Solution {
    public boolean isAnagram(String s, String t) {
        int count = 0;
        if ( s.length() == t.length()){
            char[] sSort = s.toCharArray();
            char[] tSort = t.toCharArray();

            Arrays.sort(sSort);
            Arrays.sort(tSort);

            return Arrays.equals(sSort , tSort);
        }else return false ;

    }
}
