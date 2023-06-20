public class House {

    private int floorsNumber;
   private String address;
    private int residentsNumber;
    private String[] residentsNames;


    //set array length of residentNames for add names ** FIRST STEP
    public void setResidentNumber(int residentNumber) {
        this.residentsNumber = residentNumber;
        this.residentsNames = new String[residentNumber];
    }

    // get/setter residentNames
    public String[] getResidentsNames() {
        return residentsNames;
    }
    public void setResidentsNames(int index, String name) {
        if (index >= 0 && index < residentsNames.length) {
            residentsNames[index] = name;
        }
    }

    //get/setter floorNumbers
    public int getFloorsNumber() {
        return floorsNumber;
    }
    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    // get/setter address.
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}