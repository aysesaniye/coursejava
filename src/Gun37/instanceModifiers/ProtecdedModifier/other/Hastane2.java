package Gun37.instanceModifiers.ProtecdedModifier.other;

import Gun37.instanceModifiers.ProtecdedModifier.same.Doktor;

public class Hastane2 {

    // protected oldugunda default gibi
    // diger paketlerden kullailamiyor
    // Doktor dr3= new Doctor();

    // bu erisim public oldugundan kullailabildi.
    Doktor dr4=new Doktor("Omer");

    // erisim belirteci protected oldugundan kullanilamaz.
    // dr4.print();
}
