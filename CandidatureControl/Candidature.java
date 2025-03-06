package CandidatureControl;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class Candidature {


    public static void main(String[] args) {
        ArrayList<String> candidatesSelected = candidateSelection(2000);
        printCandidates(candidatesSelected);

        ArrayList<Boolean> statusCandidates = new ArrayList<Boolean>();
        
        for (String candidate: candidatesSelected)
        {
            statusCandidates.add(callToCandidate(candidate, candidatesSelected));
        }
        
        System.out.println("_____________________________________________________");

        for (int i = 0 ; i < statusCandidates.size(); i++)
        {
            System.out.println(statusCandidates.get(i));
        }
    }


    static boolean tryCall()
    {
        return new Random().nextInt(3)==1;
    }


    static boolean callToCandidate(String candidateName, ArrayList<String> candidates)
    {
        int attempsLeft = 3;
        boolean stopCalling = false, succeeded = false;
        
        while (attempsLeft > 0 && !stopCalling)
        {
            System.out.println("Calling to " + candidateName + "...");

            if (!tryCall())
            {
                attempsLeft--;
                System.out.println(candidateName + " not accepted the call, trying again in " + attempsLeft + " Attemp");

                if (attempsLeft == 0)
                {
                    System.out.println(candidateName + " was removed from the vacancy list");
                }
            }
            else 
            {
                stopCalling = true;
                succeeded = true;
                System.out.println(candidateName + " accepted the call!");
            }
        }

        return succeeded;
    }


    static void printCandidates(ArrayList<String> candidates) {
        for(int i = 0; i < candidates.size(); i++)
        {
            System.out.println(i+1 + "° - " + candidates.get(i) + " was selected");
        }
    }


    static ArrayList<String> candidateSelection(double WageBase)
    {
        String[] candidates = { "GABRIEL", "JOÃO", "CARLOS", "MARIA", "LUANA", "LAURA", "MATEUS", "JOEL", "MARIA", "JUAN", "MARTHA", "LILIAN", "JACOB" };
        ArrayList<String> candidatesSelectedList = new ArrayList<String>();

        int candidateSelected = 0;
        int currentCandidate = 0;
        
        
        while (candidateSelected < 5)
        {
            String candidateName = candidates[currentCandidate];
            double WageCandidate = PretendValue(1800, 2200);

            if (WageCandidate >= WageBase) {
                candidatesSelectedList.add(candidateName);

                candidateSelected++;
            }

            currentCandidate++;
        }

        return candidatesSelectedList;
    }

    
    static double PretendValue(double min, double max)
    {
        return ThreadLocalRandom.current().nextDouble(min, max);
    }
    

    static void analyzeCandidate(double WagePretended, double WageCandidate)
    {   
        if (WageCandidate > WagePretended)
            System.out.println("Call to candidate");
        else if (WageCandidate == WagePretended)
            System.out.println("Call to Candidate with against proposal");
        else {
            System.out.println("Awaiting results from more candidates");
        }
    }

}
