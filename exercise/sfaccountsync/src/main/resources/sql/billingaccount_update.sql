update `billingaccount` 
set 
name = :name,
city = :city,
street = :street,
state = :state,
phone = :phone,
postalCode = :postalCode,
country = :country,
lastSyncedTime = :lastSyncedTime,
lastModifiedTime = :lastModifiedTime
where id=:id
