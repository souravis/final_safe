/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BillingRole;
import Business.Role.DonerManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author souravsingh
 */
public class OrganDonationOrganisation extends Organization {
    
    public OrganDonationOrganisation(String name) {

        super(name, Organization.Type.Organ.getValue());
    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new DonerManagerRole());
        return roles;

    }
}
