package com.tms.Transport;

public interface IEnergyCacul {
    default  double calculationPower(double energy) {
        double powerKw = 0.74;
        for (double i = 0; i < energy; i++) {
            powerKw += 0.74;
        }
        return powerKw;
    }
}
