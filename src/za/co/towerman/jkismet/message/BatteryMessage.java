/**
 * za.co.towerman.jkismet.message.BatteryMessage
 * Copyright (C) 2012 Edwin Peer
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.towerman.jkismet.message;

import za.co.towerman.jkismet.Capability;

/**
 *
 * @author espeer
 */
public class BatteryMessage extends KismetMessage {
    private int percentage;
    private boolean mainsPowered;
    private boolean charging;
    private int remainingSeconds;

    public boolean isCharging() {
        return charging;
    }

    @Capability("charging")
    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public boolean isMainsPowered() {
        return mainsPowered;
    }

    @Capability("ac")
    public void setMainsPowered(boolean mainsPowered) {
        this.mainsPowered = mainsPowered;
    }

    public int getPercentage() {
        return percentage;
    }

    @Capability("percentage")
    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getRemainingSeconds() {
        return remainingSeconds;
    }

    @Capability("remaining")
    public void setRemainingSeconds(int remainingSeconds) {
        this.remainingSeconds = remainingSeconds;
    }

    @Override
    public String toString() {
        return "BatteryMessage{" + "percentage=" + percentage + ", mainsPowered=" + mainsPowered + ", charging=" + charging + ", remainingSeconds=" + remainingSeconds + '}';
    }
    
}
