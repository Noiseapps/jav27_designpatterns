package pl.noiseapps.patterns.builder.pcbuilder;

import com.sun.deploy.net.MessageHeader;

import java.util.List;

public class PcBuilder {

    private Motherboard motherboard;
    private CPU cpu;
    private List<RAM> ram;

    PcBuilder setMotherBoard(Motherboard motherboard) {
        this.motherboard = motherboard;
        if(!motherboard.isCompatibleWith(cpu)) {
            this.cpu = null;
        }
        return this;
    }

    PcBuilder setCpu(CPU cpu) {
        if(motherboard.isCompatibleWith(cpu)) {
            this.cpu = cpu;
        } else {
            throw new IllegalArgumentException("");
        }
        return this;
    }

    PcBuilder addRam(RAM ram) {
        this.ram.add(ram);
        return this;
    }

    PC build() {
        return new PC();
    }
}
