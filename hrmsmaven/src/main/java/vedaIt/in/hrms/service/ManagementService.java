package vedaIt.in.hrms.service;


import vedaIt.in.hrms.model.Management;

import java.util.List;

public interface ManagementService {
    Management createManagement(Management management);
    List<Management> getManagementDetails();
    Management updateManagementDetails(Management management);
    void deleteManagement(int mangntId );

}
