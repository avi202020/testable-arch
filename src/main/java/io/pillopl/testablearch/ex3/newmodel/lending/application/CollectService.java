package io.pillopl.testablearch.ex3.newmodel.lending.application;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CollectService {

    Result placeOnHold(CollectCommand command) {
        //new model implementation
        return Result.Allowance;
    }


}

