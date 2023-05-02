trigger InsuranceTrigger on Account (after insert, after update) {
    // Lead Generation, Proposal and Quotation Generation
    if (Trigger.isInsert || Trigger.isUpdate) {
        List<Task> tasksToInsert = new List<Task>();
        List<Account> accountsToUpdate = new List<Account>();

        for(Account acc : Trigger.new) {
            if(acc.Lead_Generation__c) {
                Task task = new Task();
                task.Subject = 'Generate Proposal and Quotation';
                task.OwnerId = acc.OwnerId;
                task.WhatId = acc.Id;
                tasksToInsert.add(task);

                acc.Quotation_Generated__c = true;
                accountsToUpdate.add(acc);
            }
        }

        if(tasksToInsert.size() > 0) {
            insert tasksToInsert;
            update accountsToUpdate;
        }
    }
    
    // Unit Configuration
    if (Trigger.isInsert) {
        List<Task> tasksToInsert = new List<Task>();
        List<Account> accountsToUpdate = new List<Account>();

        for(Account acc : Trigger.new) {
            if(acc.Unit_Configuration__c) {
                Task task = new Task();
                task.Subject = 'Configure Master Policies';
                task.OwnerId = acc.OwnerId;
                task.WhatId = acc.Id;
                tasksToInsert.add(task);

                acc.Unit_Configuration_Completed__c = true;
                accountsToUpdate.add(acc);
            }
        }

        if(tasksToInsert.size() > 0) {
            insert tasksToInsert;
            update accountsToUpdate;
        }
    }

    // ZO Approval
    if (Trigger.isInsert || Trigger.isUpdate) {
        List<Task> tasksToInsert = new List<Task>();
        List<Account> accountsToUpdate = new List<Account>();

        for(Account acc : Trigger.new) {
            if(acc.ZO_Approval__c) {
                Task task = new Task();
                task.Subject = 'Approve Deviations';
                task.OwnerId = acc.OwnerId;
                task.WhatId = acc.Id;
                tasksToInsert.add(task);

                acc.ZO_Approval_Completed__c = true;
                accountsToUpdate.add(acc);
            }
        }

        if(tasksToInsert.size() > 0) {
            insert tasksToInsert;
            update accountsToUpdate;
        }
    }

    // CO Approval
    if (Trigger.isInsert || Trigger.isUpdate) {
        List<Task> tasksToInsert = new List<Task>();
        List<Account> accountsToUpdate = new List<Account>();

        for(Account acc : Trigger.new) {
            if(acc.CO_Approval__c) {
                Task task = new Task();
                task.Subject = 'Approve Deviations and Pricing';
                task.OwnerId = acc.OwnerId;
                task.WhatId = acc.Id;
                tasksToInsert.add(task);

                acc.CO_Approval_Completed__c = true;
                accountsToUpdate.add(acc);
            }
        }

        if(tasksToInsert.size() > 0) {
            insert tasksToInsert;
            update accountsToUpdate;
        }
    }

    // Re-insurer Approval
    if (Trigger.isInsert || Trigger.isUpdate) {
        List<Task> tasksToInsert = new List<Task>();
        List<Account> accountsToUpdate = new List<Account>();

        for(Account acc : Trigger.new) {
            if(acc.Re_Insurer_Approval__c) {
                Task task = new Task();
                task.Subject = 'Approve Re-insurer Pricing';
                task.OwnerId = acc.OwnerId;
                task.WhatId = acc.Id;
                tasksToInsert.add(task);

                acc.Re_Insurer_Approval_Completed__c = true;
                accountsToUpdate.add(acc);
            }
        }

        if(tasksToInsert.size() > 0) {
            insert tasksToInsert;
            update accounts