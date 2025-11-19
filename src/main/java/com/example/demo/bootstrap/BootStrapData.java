package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        if(partRepository.count()==0) {

            //creating an object from the inhouse part
            InhousePart phoneScreen = new InhousePart();

            //setting the values
            phoneScreen.setName("Phone Screen");
            phoneScreen.setInv(20);
            phoneScreen.setPrice(60.0);
            phoneScreen.setId(5);
            phoneScreen.setMinInv(1);
            phoneScreen.setMaxInv(50);

            partRepository.save(phoneScreen);

            //creating an object from the inhouse part
            InhousePart cameraPart = new InhousePart();

            //setting the values
            cameraPart.setName("Camera Part");
            cameraPart.setInv(10);
            cameraPart.setPrice(60.0);
            cameraPart.setId(10);
            cameraPart.setMinInv(1);
            cameraPart.setMaxInv(50);

            partRepository.save(cameraPart);

            //creating an object from the inhouse part
            InhousePart simSD = new InhousePart();

            //setting the values
            simSD.setName("Sim Card & SD Card Tray");
            simSD.setInv(15);
            simSD.setPrice(20.0);
            simSD.setId(15);
            simSD.setMinInv(1);
            simSD.setMaxInv(50);

            partRepository.save(simSD);

            //creating an object from the inhouse part
            InhousePart micPart = new InhousePart();

            //setting the values
            micPart.setName("Microphone Part");
            micPart.setInv(20);
            micPart.setPrice(20.0);
            micPart.setId(20);
            micPart.setMinInv(1);
            micPart.setMaxInv(50);

            partRepository.save(micPart);

            //creating an object from the outsourced part
            OutsourcedPart speakerPart= new OutsourcedPart();

            //setting the values
            speakerPart.setCompanyName("Western Governors University");
            speakerPart.setName("Speaker Part");
            speakerPart.setInv(5);
            speakerPart.setPrice(65.0);
            speakerPart.setId(25);
            speakerPart.setMinInv(1);
            speakerPart.setMaxInv(50);
            outsourcedPartRepository.save(speakerPart);
        }

        if(productRepository.count()==0) {
            //creating an object from the product class
            Product crackedScreenRepair = new Product("Cracked Screen Repair", 80.0, 10);
            productRepository.save(crackedScreenRepair);

            //creating an object from the product class
            Product cameraRepair = new Product("Camera Repair", 100.0, 18);
            productRepository.save(cameraRepair);

            //creating an object from the product class
            Product simSDInstall = new Product("Sim Card & SD Card Tray Install", 20.0, 20);
            productRepository.save(simSDInstall);

            //creating an object from the product class
            Product microphoneRepair = new Product("Microphone Repair", 45.0, 9);
            productRepository.save(microphoneRepair);

            //creating an object from the product class
            Product speakerRepair = new Product("Speaker Repair", 80.0, 11);
            productRepository.save(speakerRepair);
        }

        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
