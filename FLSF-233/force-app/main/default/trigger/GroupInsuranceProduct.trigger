trigger GroupInsuranceTrigger on Lead (before insert, before update, after insert, after update) { 
  //Lead generation, creation, proposal, and quotation generation 
  if(Trigger.isBefore && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.LeadSource == null || l.LeadSource == '') { 
        l.addError('Lead Source is required.'); 
      } 
    } 
  } 
  
  //Unit (new business) configuration, mapping, underwriting, issuing policy bonds, collecting stamp duty, and generating reports 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Unit_Number__c != null && l.Unit_Number__c != '') { 
        //Perform new business configuration 
        //Perform mapping 
        //Perform underwriting 
        //Issue policy bonds 
        //Collect stamp duty 
        //Generate reports 
      } 
    } 
  } 
  
  //ZO approval for deviations in underwriting, reinsurance, and statutory reports 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Zone_Officer__c != null && l.Zone_Officer__c != '') { 
        //Perform ZO approval 
        //Validate underwriting 
        //Validate reinsurance 
        //Validate statutory reports 
      } 
    } 
  } 
  
  //CO approval for deviations, underwriting pricing, reinsurance, delayed claims, new product configuration, unit code, ZO code creation, scheme-wise interest tables, premium rate tables, and centralized collection and payment-related activities 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Controller_Officer__c != null && l.Controller_Officer__c != '') { 
        //Perform CO approval 
        //Validate deviations 
        //Validate underwriting pricing 
        //Validate reinsurance 
        //Validate delayed claims 
        //Validate new product configuration 
        //Validate unit code 
        //Validate ZO code creation 
        //Validate scheme-wise interest tables 
        //Validate premium rate tables 
        //Validate centralized collection and payment-related activities 
      } 
    } 
  } 
  
  //Actuarial team to perform valuations 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Actuarial_Team__c != null && l.Actuarial_Team__c != '') { 
        //Perform valuations 
      } 
    } 
  } 
  
  //Re-insurer to make pricing decisions 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Reinsurer__c != null && l.Reinsurer__c != '') { 
        //Perform pricing decisions 
      } 
    } 
  } 
  
  //Underwriter to make underwriting pricing decisions and decisions related to underwriting 
  if(Trigger.isAfter && (Trigger.isInsert || Trigger.isUpdate)) { 
    //Validate lead data 
    for(Lead l : Trigger.new) { 
      if(l.Underwriter__c != null && l.Underwriter__c != '') { 
        //Perform underwriting pricing decisions 
        //Perform underwriting decisions 
      } 
    } 
  } 
  
  //Master policy holder to manage member data, payments, claim forms, changes in scheme rules, consent for renewal, member addition, request for conversion, withdrawal, surrender, member-level payments