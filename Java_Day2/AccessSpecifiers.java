class AccessSpecifiers{
    public int publicVariable = 10;       
    protected int protectedVariable = 20; 
    int defaultVariable = 30;             
    private int privateVariable = 40;     

    void displayAccess() {
        System.out.println("Public: " + publicVariable);
        System.out.println("Protected: " + protectedVariable);
        System.out.println("Default: " + defaultVariable);
        System.out.println("Private: " + privateVariable);
    }
    public static void main(String[] args){
        AccessSpecifiers check = new AccessSpecifiers();
        check.displayAccess();
    }
}
