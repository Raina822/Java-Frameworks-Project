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
            InhousePart screenReplacement = new InhousePart();

            //setting the values
            screenReplacement.setName("Screen Replacement");
            screenReplacement.setInv(20);
            screenReplacement.setPrice(80.0);
            screenReplacement.setId(5);
            screenReplacement.setMinInv(1);
            screenReplacement.setMaxInv(50);

            partRepository.save(screenReplacement);

            //creating an object from the inhouse part
            InhousePart cameraRepair = new InhousePart();

            //setting the values
            cameraRepair.setName("Camera Repair");
            cameraRepair.setInv(10);
            cameraRepair.setPrice(100.0);
            cameraRepair.setId(10);
            cameraRepair.setMinInv(1);
            cameraRepair.setMaxInv(50);

            partRepository.save(cameraRepair);

            //creating an object from the inhouse part
            InhousePart simReplacement = new InhousePart();

            //setting the values
            simReplacement.setName("Sim Card & SD Card Tray Replacement");
            simReplacement.setInv(15);
            simReplacement.setPrice(20.0);
            simReplacement.setId(15);
            simReplacement.setMinInv(1);
            simReplacement.setMaxInv(50);

            partRepository.save(simReplacement);

            //creating an object from the inhouse part
            InhousePart micRepair = new InhousePart();

            //setting the values
            micRepair.setName("Microphone Repair");
            micRepair.setInv(20);
            micRepair.setPrice(45.0);
            micRepair.setId(20);
            micRepair.setMinInv(1);
            micRepair.setMaxInv(50);

            partRepository.save(micRepair);

            //creating an object from the outsourced part
            OutsourcedPart speakerRepair= new OutsourcedPart();

            //setting the values
            speakerRepair.setCompanyName("Western Governors University");
            speakerRepair.setName("Speaker Repair");
            speakerRepair.setInv(5);
            speakerRepair.setPrice(80.0);
            speakerRepair.setId(25);
            speakerRepair.setMinInv(1);
            speakerRepair.setMaxInv(50);
            outsourcedPartRepository.save(speakerRepair);
        }

        if(productRepository.count()==0) {
            //creating an object from the product class
            Product screenProtector = new Product("Tempered Glass Screen Protector", 60.0, 10);
            productRepository.save(screenProtector);

            //creating an object from the product class
            Product lightningCable = new Product("Lightning Charging Cable", 15.0, 18);
            productRepository.save(lightningCable);

            //creating an object from the product class
            Product usbCCable = new Product("USB-C Charging Cable", 10.0, 20);
            productRepository.save(usbCCable);

            //creating an object from the product class
            Product iPhoneCase = new Product("iPhone Phone Case", 55.0, 9);
            productRepository.save(iPhoneCase);

            //creating an object from the product class
            Product samsungCase = new Product("Samsung Phone Case", 50.0, 11);
            productRepository.save(samsungCase);
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
