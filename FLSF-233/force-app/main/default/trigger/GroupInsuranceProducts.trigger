trigger leadManagement on Lead (after update, after delete) { 
    if (Trigger.isAfter && Trigger.isUpdate) {
        if (Trigger.old.Status == 'Open' && Trigger.new.Status == 'Qualified') {
            // Create new quote
            Quote newQuote = new Quote();
            newQuote.Name = Trigger.new.Name + ' Quote';
            newQuote.LeadId = Trigger.new.Id;
            insert newQuote;
        }
    }
    if (Trigger.isAfter && Trigger.isDelete) {
        List<Quote> quotesToDelete = [SELECT Id FROM Quote WHERE LeadId = :Trigger.old.Id];
        delete quotesToDelete;
    }
}