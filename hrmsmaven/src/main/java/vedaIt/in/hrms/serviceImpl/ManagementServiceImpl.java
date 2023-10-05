package vedaIt.in.hrms.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vedaIt.in.hrms.model.Management;
import vedaIt.in.hrms.repository.ManagementRepo;
import vedaIt.in.hrms.service.ManagementService;

import java.util.List;
@Service
public class ManagementServiceImpl implements ManagementService {
    @Autowired
    ManagementRepo managementRepo;
    @Override
    public Management createManagement(Management management) {
        Management management1=managementRepo.save(management);
        return management1;
    }

    @Override
    public List<Management> getManagementDetails() {
        List<Management> management=managementRepo.findAll();
        return management;
    }

    @Override
    public Management updateManagementDetails(Management management) {
        return null;
    }

    @Override
    public void deleteManagement(int mangntId) {
        managementRepo.deleteById(mangntId);
    }

}
