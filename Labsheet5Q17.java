interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionMachine implements Printer, Scanner {
    private String machineName;
    private String machineId;
    
    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getMachineId() {
        return machineId;
    }

    public void setMachineId(String machineId) {
        this.machineId = machineId;
    }

    @Override
    public void print() {
        System.out.println(machineName + " is printing documents...");
    }

    @Override
    public void scan() {
        System.out.println(machineName + " is scanning physical papers...");
    }
}

public class Labsheet5Q17 {
    public static void main(String[] args) {
        MultiFunctionMachine mfm = new MultiFunctionMachine();
        mfm.setMachineName("HP LaserJet All-In-One");
        mfm.setMachineId("MFM-9021");

        System.out.println("Machine Details: " + mfm.getMachineName() + " (ID: " + mfm.getMachineId() + ")");
        mfm.print();
        mfm.scan();
    }
}