package lambda;

import java.time.ZonedDateTime;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import lambda.model.InputThing;
import lambda.model.OutputThing;

public class HanselHandler implements RequestHandler<InputThing,OutputThing >{

    @Override
    public OutputThing handleRequest(InputThing input, Context context) {

        return new OutputThing("Hello " + input.getName() + " - I hope you will have a wonderful day. the time is now " + ZonedDateTime.now()) ;


    }

}
