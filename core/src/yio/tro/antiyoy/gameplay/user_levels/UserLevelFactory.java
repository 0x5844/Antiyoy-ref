package yio.tro.antiyoy.gameplay.user_levels;

import yio.tro.antiyoy.gameplay.user_levels.pack.*;

import java.util.ArrayList;

public class UserLevelFactory {


    private static UserLevelFactory instance;
    ArrayList<AbstractLegacyUserLevel> levels;


    public static void initialize() {
        instance = null;
    }


    public static UserLevelFactory getInstance() {
        if (instance == null) {
            instance = new UserLevelFactory();
        }

        return instance;
    }


    public UserLevelFactory() {
        levels = new ArrayList<>();
        initLevels();
    }


    private void initLevels() {
        // 10
        addArray(new AbstractLegacyUserLevel[]{
                new UlevEatenAlive(),
                new UlevConjunctions(),
                new UlevMiniTournament(),
                new UlevFromCenter(),
                new UlevUnfairIslands(),
                new UlevWindmill(),
                new UlevDmOne(),
                new UlevLightAndDarkness(),
                new UlevHolyEurope(),
                new UlevDoorway(),
                new UlevJustLevelTwo(),
                new UlevSaveKooNation(),
                new UlevIvanKo(),
                new UlevSecondWorldFromRusky(),
                new UlevJustLevelThree(),
                new UlevBelgium(),
                new UlevBigNeighbor(),
                new UlevSpikes(),
                new UlevDino(),
                new UlevRiseOfCivilizations(),
                new UlevRescueForest(),
                new UlevNeighbourhood(),
                new Ulev2030SouthAmerica(),
                new UlevDoubleLanes(),
                new UlevThinkTwice(),
                new UlevJustLevelUp(),
                new UlevBackyardSale(),
                new UlevForJasmin(),
                new UlevAf3(),
                new UlevInDilemma(),
                new UlevDota(),
                new UlevHardhex(),
                new UlevDrunken(),
                new UlevLockedIn(),
                new UlevDa1(),
                new UlevDa2(),
                new UlevLuckyGreenOne(),
                new UlevIslandOfUnity(),
                new UlevAf2(),
                new UlevTripleThreat(),
                new UlevYellowBarrier(),
                new UlevGekokujo(),
                new UlevUsa1793(),
        });

        // 7
        add(new UlevSpaghettiMonster());
        add(new UlevRelax());
        add(new UlevStarship());
        add(new UlevWorld());
        add(new UlevSerdechko());
        add(new UlevBigCheese());
        add(new UlevAF1());
        add(new UlevGuynneDaSteve());
        add(new UlevPizza());
        add(new UlevBaseball());
        add(new UlevBetweenTwoFires());
        add(new UlevNotStalemate());
        add(new UlevMedievalAgeEurope());
        add(new UlevLabyrinth());
        add(new UlevUnderpressure());
        add(new UlevBlackAndWhiteOne());
        add(new UlevBlackAndWhiteTwo());
        add(new UlevEurope1770());
        add(new UlevGoncharov());
        add(new UlevMini1v1());
        add(new UlevEurope1914());
        add(new UlevItaly1494());
        add(new UlevColonisationOfAustralia());
        add(new UlevSkyrim());
        add(new UlevBundeslaender());
        add(new UlevLatinAmerica());
        add(new UlevEnterprise());
        add(new UlevStindoWar());
        add(new UlevCantBeEasier());
        add(new UlevDmitryPodduba());
        add(new UlevUnifyGermany());

        // 6
        add(new UlevEleventhTimesTheCharm());
        add(new UlevUnbeatable());
        add(new UlevSquid());
        add(new UlevATwo());
        add(new UlevAThree());
        add(new UlevLightsGoOut());
        add(new UlevWaaaaaay());
        add(new UlevYouShallNotPass());
        add(new UlevHardBunker());
        add(new UlevBunkerMap());
        add(new UlevGraySquare());
        add(new UlevHexahedronAdventures());
        add(new UlevMoneyIsPower());
        add(new UlevKaerMorhen());
        add(new UlevProject25());
        add(new UlevFlintWaterCrisis());
        add(new UlevMuertos());
        add(new UlevHunterVsGatherer());
        add(new UlevForKettles());
        add(new UlevNeverQuit());
        add(new UlevBunker1());
        add(new UlevBunker2());
        add(new UlevBunker3());
        add(new UlevBunker4());
        add(new UlevBunker5());
        add(new UlevTriangle());
        add(new UlevGates());
        add(new UlevOleg3());
        add(new UlevTemporaryDifficulties());
        add(new UlevHardBunker3());
        add(new UlevJapanKingdom());
        add(new UlevXisumaIsland());
        add(new Ulev1939Diacharik());
        add(new UlevScandinavia());

        // 5
        add(new UlevSeventhTimesTheCharm());
        add(new UlevHexahedron());
        add(new UlevTripleDuo());
        add(new UlevForestSpirit());
        add(new UlevHoot());
        add(new UlevSnowflake());
        add(new UlevEyeOfTheStorm());
        add(new UlevLure());
        add(new UlevCarrotAndBunny());
        add(new UlevHistoryFight());
        add(new UlevNowhereToHide());
        add(new UlevAntFarm());
        add(new UlevGreatForest());
        add(new UlevCastleIsles());
        add(new UlevLittleKingdom());
        add(new UlevDichArik());
        add(new UlevBoneBreaker());
        add(new UlevDoubleThreat());
        add(new UlevCatan());
        add(new UlevTahaFidan());
        add(new UlevDna());
        add(new UlevMarketPower());
        add(new UlevJustinSullivan());
        add(new UlevHoneyComb());
        add(new UlevWagonWheel());
        add(new UlevNinoBambino());
        add(new UlevDieBrucke());
        add(new UlevFlowerpot());
        add(new UlevTiny());
        add(new UlevComingForYou());
        add(new UlevPolishVoivodeships());
        add(new Ulev900to1200());
        add(new UlevJustinSullivanIII());
        add(new UlevSecurityLevels());
        add(new UlevFairOrSquare());
        add(new UlevDoubleTrouble());
        add(new UlevOttomanEmpire());
        add(new UlevForbiddenForest());
        add(new UlevA1());
        add(new UlevAmplob());
        add(new UlevRainbow());
        add(new UlevEpicenter());
        add(new UlevNetherlands());
        add(new UlevGreatWar());
        add(new UlevThorSnowflake());
        add(new UlevVikingInvasion());
        add(new UlevBattleForGermanEmpire());
        add(new UlevSurrounded());
        add(new UlevSurroundMap());
        add(new UlevStopTheRevolution());
        add(new UlevForest());
        add(new UlevPrisonBreak());
        add(new UlevNinoAlo());
//        add(new UlevBreakUpOfYugoslavia()); // temporarily removed
        add(new UlevTurkey1919());
        add(new UlevALotToKeepTrackOf());
        add(new Ulev1940());
        add(new UlevJustinSullivanII());
        add(new UlevPeninsularWar());
        add(new UlevWarOfLove());
        add(new UlevKrzycho());
        add(new UlevGoBlue());
        add(new UlevEuropeInMonkey());
        add(new UlevPipeNet());
        add(new UlevIslandByIsland());
        add(new UlevRegionsRussianFederation());
        add(new UlevFetih1453());

        // default examples
        add(new UlevExample1());
        add(new UlevExample2());
        add(new UlevExample3());

        // 4
        add(new UlevTheWeb());
        add(new UlevKingOfTheIsland());
        add(new UlevZeraXenonArena());
        add(new UlevBlackForest());
        add(new UlevLeBlanc());
        add(new UlevAlmostFair());
        add(new UlevPurpleWiggles());
        add(new UlevTwoForOne());
        add(new UlevTheophileDugue());
        add(new UlevMinasTirith());
        add(new UlevGreatColonization());
        add(new UlevAfrica1936());
        add(new UlevIslandOfDeath());
        add(new UlevWarOnIsland());
        add(new UlevWoman());
        add(new UlevAtlantidaWar());

        // 3
        add(new UlevSpiderTrap());
        add(new UlevManInTheMiddle());
        add(new UlevSixKingdoms());
        add(new UlevInsideOut());
        add(new UlevTarget());
        add(new UlevSouthAmerica());
        add(new UlevBackdoor());
        add(new UlevStroke());
        add(new UlevConquestOfBritain());
        add(new UlevAbandonedValley());
        add(new UlevScaryWWII());

        // 2
        add(new UlevSpiral());
        add(new UlevAssymetry());
        add(new UlevFennia());
        add(new UlevButterfly());
        add(new UlevSevenEmpires());
        add(new UlevSorvixChallengeArena());
        add(new UlevHalma());
        add(new UlevMeetInTheMiddle());
        add(new UlevAntsNest());
        add(new UlevTwoLands());
        add(new UlevWarOnTheRiver());
        add(new UlevWarOfStrategy());
        add(new UlevWarToEndAllWars());
        add(new UlevOneOnOne());
        add(new UlevBridgeFort());
        add(new UlevReikEpsilon());
        add(new UlevWesternBalkan());
        add(new UlevJapanConquest());
        add(new UlevKWar());

        // 1
        add(new UlevPuhtaytoe());
        add(new UlevHumeniuk());
        add(new UlevHansJurgen());
        add(new UlevVladSender1());
        add(new UlevVladSender2());
        add(new UlevLattice());
        add(new UlevSixFlags());
        add(new UlevCoastalCrescent());
        add(new UlevSteveUpsideDown());
        add(new UlevOleg1());
        add(new UlevOleg2());
        add(new UlevMirage212());
        add(new UlevConquestOfItalicPeninsula());
    }


    private void addArray(AbstractLegacyUserLevel array[]) {
        for (AbstractLegacyUserLevel abstractLegacyUserLevel : array) {
            add(abstractLegacyUserLevel);
        }
    }


    private void add(AbstractLegacyUserLevel level) {
        levels.add(level);
    }


    public ArrayList<AbstractLegacyUserLevel> getLevels() {
        return levels;
    }


    public AbstractLegacyUserLevel getLevel(String key) {
        for (AbstractLegacyUserLevel level : levels) {
            if (level.getKey().equals(key)) {
                return level;
            }
        }

        return null;
    }
}

