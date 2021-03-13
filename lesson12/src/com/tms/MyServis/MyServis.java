package com.tms.MyServis;

@Version(versionName = "Nougat", num = 7.11)
class MyServis {
    private String name = "Nougat";
    private double version = 7.11;

    public MyServis(String name, double vers) {
        this.name = name;
        this.version = vers;

    }

    public String getName(String name) {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object myServis) {
        return equals(myServis);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public void classInfo() {
        System.out.println(this.name + this.version);
    }
}
