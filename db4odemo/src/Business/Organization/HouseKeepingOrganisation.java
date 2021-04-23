/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.HousekeepingRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;




/**
 *
 * @author souravsingh
 */
public class HouseKeepingOrganisation extends Organization {
    
     public HouseKeepingOrganisation(String name) {

        //super(name, Organization.Type.Housekeeping.getValue());
        super(name,Organization.Type.Housekeeping.getValue());
    }

    @Override
    public List<Role> getSupportedRole() {
        List<Role> roles = new ArrayList<>();
        roles.add(new HousekeepingRole());
        return roles;

    }
}
