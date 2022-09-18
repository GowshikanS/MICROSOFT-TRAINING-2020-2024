String[] array = s.split(" ");
Arrays.sort(array, Comparator.comparingInt(o -> o.charAt(o.length() - 1)));
String ans = "";
for (String arrS : array) {
ans = ans + " " + arrS.substring(0, arrS.length() - 1) ;
}
return ans.trim();
