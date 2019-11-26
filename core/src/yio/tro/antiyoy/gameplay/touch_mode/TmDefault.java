package yio.tro.antiyoy.gameplay.touch_mode;

import yio.tro.antiyoy.gameplay.*;
import yio.tro.antiyoy.gameplay.diplomacy.DiplomacyManager;
import yio.tro.antiyoy.gameplay.diplomacy.DiplomaticEntity;
import yio.tro.antiyoy.gameplay.rules.GameRules;
import yio.tro.antiyoy.menu.diplomacy_element.DiplomacyElement;
import yio.tro.antiyoy.menu.scenes.Scenes;

public class TmDefault extends TouchMode{

    public TmDefault(GameController gameController) {
        super(gameController);
    }


    @Override
    public void onModeBegin() {

    }


    @Override
    public void onModeEnd() {

    }


    @Override
    public void move() {

    }


    @Override
    public boolean isCameraMovementEnabled() {
        return true;
    }


    @Override
    public void onTouchDown() {
        if (gameController.currentTouchCount == 1) {
            gameController.setCheckToMarch(true);
        }
    }


    @Override
    public void onTouchDrag() {

    }


    @Override
    public void onTouchUp() {

    }


    @Override
    public boolean onClick() {
        FieldManager fieldManager = gameController.fieldManager;
        fieldManager.updateFocusedHex();
        SelectionManager selectionManager = gameController.selectionManager;
        selectionManager.setFocusedHex(fieldManager.focusedHex);
        gameController.showFocusedHexInConsole();

        if (selectionManager.checkForCityNameReaction()) return true;

        if (fieldManager.focusedHex != null && gameController.isPlayerTurn()) {
            selectionManager.focusedHexActions(fieldManager.focusedHex);
            checkForDiplomaticForeignSelection(fieldManager.focusedHex);
        }
        return true;
    }


    private void checkForDiplomaticForeignSelection(Hex focusedHex) {
        if (!GameRules.diplomacyEnabled) return;
        if (focusedHex.isNeutral()) return;

        int fraction = focusedHex.fraction;
        if (gameController.isCurrentTurn(fraction)) return;

        FieldManager fieldManager = gameController.fieldManager;
        Province provinceByHex = fieldManager.getProvinceByHex(focusedHex);
        if (provinceByHex == null) return;

        DiplomacyManager diplomacyManager = fieldManager.diplomacyManager;
        DiplomaticEntity entity = diplomacyManager.getEntity(fraction);
        if (entity == null) return;

        Scenes.sceneDiplomacy.create();
        DiplomacyElement diplomacyElement = Scenes.sceneDiplomacy.diplomacyElement;
        diplomacyElement.move();
        diplomacyElement.move();
        diplomacyElement.applyClickByFraction(fraction);
    }


    @Override
    public String getNameKey() {
        return null;
    }
}
