/* Copyright (C) 2014  olie.xdev <olie.xdev@googlemail.com>
*
*    This program is free software: you can redistribute it and/or modify
*    it under the terms of the GNU General Public License as published by
*    the Free Software Foundation, either version 3 of the License, or
*    (at your option) any later version.
*
*    This program is distributed in the hope that it will be useful,
*    but WITHOUT ANY WARRANTY; without even the implied warranty of
*    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
*    GNU General Public License for more details.
*
*    You should have received a copy of the GNU General Public License
*    along with this program.  If not, see <http://www.gnu.org/licenses/>
*/

package com.health.openscale.core;

import java.util.Date;

public class ScaleUser {
    public static final String[] UNIT_STRING = new String[] {"kg", "lb", "st"};

	public int id;
    public String user_name;
	public Date birthday;
	public int body_height;
	public int scale_unit;
	
	@Override
	public String toString()
	{
		return "ID : " + id + " NAME: " + user_name + " BIRTHDAY: " + birthday.toString() + " BODY_HEIGHT: " + body_height + " SCALE_UNIT: " + UNIT_STRING[scale_unit];
	}
}