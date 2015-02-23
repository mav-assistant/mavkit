/*
 * This file is part of Mav.
 *
 * Mav is free software: you can redistribute it and/or modify it under the terms
 * of the GNU Lesser General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Mav is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License along
 * with Mav. If not, see <http://www.gnu.org/licenses/>.
 */
package com.gameminers.mav.firstrun;

import com.gameminers.mav.Dialogs;
import com.gameminers.mav.Mav;
import com.gameminers.mav.render.RenderState;

public class FirstRunThread extends Thread {
	@Override
	public void run() {
		try {
			RenderState.text = "\u00A7LHi! I'm Mav.\nI don't know who you are,\nso let's fix that.\n\nFirst off, what's your name?\n\u00A7sClick inside the box to start typing.";
			Mav.currentScreen = new FirstRunScreen();
			Mav.ttsInterface.sayWithEmotion("<emotionml version='1.0' xmlns='http://www.w3.org/2009/10/emotionml' category-set='http://www.w3.org/TR/emotion-voc/xml#everyday-categories'><emotion><category name='happy'/>Hi! I'm Mav.</emotion>I dont know who you are, so let's fix that.<emotion><category name='interested'/>First off, what is your name?</emotion></emotionml>", "Hi! I'm Mav. I dont know who you are, so let's fix that. First off, what is your name?");
		} catch (Throwable t) {
			Dialogs.showErrorDialog(null, "An error occured during first run setup.", t);
		}
	}
}
