/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author souravsingh
 */
public class HospitalEnterprise extends Enterprise {

    public HospitalEnterprise(String name) {
        super(name, EnterpriseType.Hospital);

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Type> getSupportedOrganization() {

        List<Organization.Type> supportedOrganization = new ArrayList<>();
        supportedOrganization.add(Organization.Type.PrimaryCare);
        supportedOrganization.add(Organization.Type.Lab);
        supportedOrganization.add(Organization.Type.Finance);
        supportedOrganization.add(Organization.Type.Organ);
         supportedOrganization.add(Organization.Type.ChemistandDruggist);
        return supportedOrganization;

    }

}
