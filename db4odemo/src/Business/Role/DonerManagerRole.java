/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PrimaryCareOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.Clinic.BillingWorkAreaJPanel;
import UserInterface.Clinic.DonerMangerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author souravsingh
 */
public class DonerManagerRole extends Role{
    
    private static final String ROLE_NAME = "Doner Manager Role";

    
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Network network, Organization organization, Enterprise enterprise, EcoSystem business) {

        return new DonerMangerWorkAreaJPanel(userProcessContainer,network, enterprise, organization, account);
    }
    @Override
    public String toString() {
        return ROLE_NAME;
    }
    
}
