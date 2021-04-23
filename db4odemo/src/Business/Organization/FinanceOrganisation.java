/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BillingRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author souravsingh
 */
public class FinanceOrganisation extends Organization {
    
    public FinanceOrganisation(String name) {

        super(name, Organization.Type.Finance.getValue());
    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new BillingRole());
        return roles;

    }
}
