package fun.starplum.util;

import java.util.List;

import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.Role;
import net.dv8tion.jda.api.entities.User;

/**
 * Util class for different type of pings for JDA
 * @author Michael Faton
 */

public class PingUtils {

	public static String pingRole(String ID) { return "<@&" + ID + ">"; }
	public static String pingUser(String ID) { return "<@!" + ID + ">"; }
	public static String pingChannel(String ID) { return "<#" + ID + ">"; }

}
