/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.MaintanceEnterprise;
import Business.Organization.Organization.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author souravsingh
 */
public class OrganizationDirectory {

    private List<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public List<Organization> getOrganizationList() {
        return organizationList;
    }

    public boolean isNameAlreadyPresent(String name) {

        return organizationList.stream()
                .anyMatch(org -> org.getName().equalsIgnoreCase(name));

    }

    public Organization createOrganization(Type type, String name) {
        Organization organization = null;
        if (type.getValue().equals(Type.PrimaryCare.getValue())) {
            organization = new PrimaryCareOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Counselor.getValue())) {
            organization = new CounselorOrganization(name);
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.HealthInspector.getValue())) {
            organization = new HealthInspectorOrganization(name);
            organizationList.add(organization);
        }else if(type.getValue().equals(Type.Housekeeping.getValue())) {
            organization = new HouseKeepingOrganisation(name);
            organizationList.add(organization);
        
        }else if(type.getValue().equals(Type.Finance.getValue())) {
            organization = new FinanceOrganisation(name);
            organizationList.add(organization);
        
        }else if(type.getValue().equals(Type.Organ.getValue())) {
            organization = new OrganDonationOrganisation(name);
            organizationList.add(organization);
        
    }else if(type.getValue().equals(Type.ChemistandDruggist.getValue())) {
            organization = new ChemistandDruggistOrganisation(name);
            organizationList.add(organization);
        
    }
        
     return organization;
}
}
