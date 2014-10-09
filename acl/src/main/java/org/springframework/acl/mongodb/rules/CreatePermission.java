package org.springframework.acl.mongodb.rules;

public class CreatePermission extends CRUDBase implements IRule {

    @Override
    public String getKey() {
        return "create";
    }

    @Override
    Can getCanField() {
        return Can.CREATE;
    }
}